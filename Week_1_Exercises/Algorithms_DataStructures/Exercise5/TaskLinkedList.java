public class TaskLinkedList {
    private Node taskNodeHead;

    public TaskLinkedList() {
        this.taskNodeHead = null;
    }

    public void addTask(Activity activity) {
        Node newNode = new Node(activity);
        if (taskNodeHead == null) {
            taskNodeHead = newNode;
        } else {
            Node currentNode = taskNodeHead;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public Activity searchActivity(int activityId) {
        Node currentNode = taskNodeHead;
        while (currentNode != null) {
            if (currentNode.activity.getActivityId() == activityId) {
                return currentNode.activity;
            }
            currentNode = currentNode.next;
        }
        return null; 
    }

    public void traverse() {
        Node currentNode = taskNodeHead;
        while (currentNode != null) {
            System.out.println(currentNode.activity);
            currentNode = currentNode.next;
        }
    }

    public boolean deleteActivity(int activityId) {
        if (taskNodeHead == null) {
            return false;
        }

        if (taskNodeHead.activity.getActivityId() == activityId) {
            taskNodeHead = taskNodeHead.next; 
            return true;
        }

        Node currentNode = taskNodeHead;
        while (currentNode.next != null) {
            if (currentNode.next.activity.getActivityId() == activityId) {
                currentNode.next = currentNode.next.next; 
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public static void main(String[] args) {
        TaskLinkedList activityList = new TaskLinkedList();

        // Adding activities
        activityList.addTask(new Activity(1, "Activity 1", "Incomplete"));
        activityList.addTask(new Activity(2, "Activity 2", "Complete"));
        activityList.addTask(new Activity(3, "Activity 3", "Complete"));

        // Traversing activities
        System.out.println("All activities:");
        activityList.traverse();

        // Searching for an activity
        System.out.println("Searching for Activity with ID 2:");
        Activity activity = activityList.searchActivity(2);
        if (activity != null) {
            System.out.println("Found: " + activity);
        } else {
            System.out.println("Activity not found.");
        }

        // Deleting an activity
        System.out.println("Deleting Activity with ID 1:");
        boolean isDeleted = activityList.deleteActivity(1);
        if (isDeleted) {
            System.out.println("Activity deleted.");
        } else {
            System.out.println("Activity not found.");
        }
        System.out.println("All activities after deletion:");
        activityList.traverse();
    }
}

class Node {
    Activity activity;
    Node next;

    public Node(Activity activity) {
        this.activity = activity;
        this.next = null;
    }
}


class Activity {
    private int activityId;
    private String activityName;
    private String status;

    public Activity(int activityId, String activityName, String status) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.status = status;
    }

    public int getActivityId() {
        return activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", activityName='" + activityName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}