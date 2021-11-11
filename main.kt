import javax.swing.JOptionPane;

fun main() {
    while (true) {
        try {
            var choice1 = JOptionPane.showInputDialog(null, "Enter the name of the first choice name: ");
            if (choice1!!.length < 1) {
                choice1 = "Heads"
            }
        
            var choice2 = JOptionPane.showInputDialog(null, "Enter the name of the second choice name: ");
            if (choice2!!.length < 1) {
                choice2 = "Tails"
            }
        
            val arr = listOf(choice1, choice2);
        
            JOptionPane.showMessageDialog(null, "The random choice is '${arr.random()}'.")
        } catch (e: Exception) {
            JOptionPane.showMessageDialog(null, "Goodbye!");
            System.exit(0);
        }
    }
}