package bridge.Model;

import bridge.Service.BridgeValidator;

import java.util.List;

public class Bridge {
    private final List<String> shape;

    public Bridge(List<String> shape) {
        validate(shape);
        this.shape = shape;
    }

    private void validate(List<String> shape) {
        BridgeValidator bridgeValidator = new BridgeValidator();

        bridgeValidator.validate(shape);
    }

    public int getSize() {
        return shape.size();
    }

    public boolean isCrossable() {
        //TODO: 구현
        return false;
    }
}
