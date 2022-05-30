package ss19_StringRegex.Exercise.LopHoc;

public class ClassRoomTest {

        private static ClassRoom classRoomExample;
        public static final String[] validClassRoom = new String[] { "C0318G", "A3516M" };
        public static final String[] invalidClassRoom = new String[] { "M0318G"," P0323A" };

        public static void main(String args[]) {
            classRoomExample = new ClassRoom();
            for (String classRoom : validClassRoom) {
                boolean isvalid = classRoomExample.validate(classRoom);
                System.out.println("Account is " + classRoom +" is valid: "+ isvalid);
            }
            for (String classRoom : invalidClassRoom) {
                boolean isvalid = classRoomExample.validate(classRoom);
                System.out.println("Account is " + classRoom +" is valid: "+ isvalid);
            }
        }
    }
