package DesignPatterns.state;

public class Canvas {
    private ToolType currentTool;

    public ToolType getCurrentTool() {
        return this.currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseDown() {
        if (currentTool == ToolType.SELECTION) {
            System.out.println("Selection Icon");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Brush Tool");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("ERASER Tool");
        }
    }

    public void mouseUp() {
        if (currentTool == ToolType.SELECTION) {
            System.out.println("Draw dashed rectangle");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Line");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Erase something");
        }
    }
}
