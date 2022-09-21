import java.awt.Color;
import java.awt.Component;
import java.nio.channels.ScatteringByteChannel;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 * MyTableCellRenderer
 */
public class MyTableCellRenderer extends DefaultTableCellRenderer{
    public MyTableCellRenderer() {
        super();
        setOpaque(true);
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        if(isSelected){
            setBackground(Color.blue);
        }
        setText(value != null ? value.toString() : "");
        return null;
    }
    
}
