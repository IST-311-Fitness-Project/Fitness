package FitnessModel;

import java.util.ArrayList;

public class Login {

    ArrayList<User> testUsers = new ArrayList<User>();

    public Login() {
        makeSomeArbitraryUsers();
    }//this class checks entered credentials

    private void makeSomeArbitraryUsers() {
        User someUser1 = new User("Eugene Ryoo", "1234");
        User someUser2 = new User("Nick Hunter", "1234");
        User someUser3 = new User("Noelle Fajt", "5678");
        User someUser4 = new User("Wilson Hafner", "1010");
        //later, these will be stored in a database.

        testUsers.add(someUser1);
        testUsers.add(someUser2);
        testUsers.add(someUser3);
        testUsers.add(someUser4);
    }

    public boolean test(User user) {
        //todo : check credentials from the passed user.
        boolean exists = false;

        for (int i = 0; i < testUsers.size(); ++i) {
            if (user.getUsername().equals(testUsers.get(i).getUsername())) {

                if (user.getPassword().equals(testUsers.get(i).getPassword())) {
                    exists = true;
                }

            }
        }//if the username is equal, checks the password. else, exits.

        return exists;
    }

}
