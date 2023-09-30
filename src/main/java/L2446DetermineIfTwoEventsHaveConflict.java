import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L2446DetermineIfTwoEventsHaveConflict {

//    You are given two arrays of strings that represent two inclusive events that happened on the same day, event1 and event2, where:
//
//    event1 = [startTime1, endTime1] and
//    event2 = [startTime2, endTime2].
//    Event times are valid 24 hours format in the form of HH:MM.
//
//    A conflict happens when two events have some non-empty intersection (i.e., some moment is common to both events).
//
//    Return true if there is a conflict between two events. Otherwise, return false.
//
//
//
//    Example 1:
//
//    Input: event1 = ["01:15","02:00"], event2 = ["02:00","03:00"]
//    Output: true
//    Explanation: The two events intersect at time 2:00.
//    Example 2:
//
//    Input: event1 = ["01:00","02:00"], event2 = ["01:20","03:00"]
//    Output: true
//    Explanation: The two events intersect starting from 01:20 to 02:00.
//    Example 3:
//
//    Input: event1 = ["10:00","11:00"], event2 = ["14:00","15:00"]
//    Output: false
//    Explanation: The two events do not intersect.

//    public boolean haveConflict(String[] event1, String[] event2) {
//
//        if (event1[1].equals(event2[0]) || (event2[1].equals(event1[0]))) {
//           return true;
//       } else {
//            List<String> list = new ArrayList<>();
//               for (String e: event1) {
//                   list.add(e.split(":"));
//               }
//            for (String e: event2) {
//                list.add(e.split(":"));
//            }
//            for (int i = 0; i < list.size(); i++) {
//
//            }
//
//       }
//        return false;
//    }
}
