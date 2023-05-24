package com.ricknash.patterns.behavioral.state;

public class Developer {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleep) {
            setActivity(new Code());
        } else if (activity instanceof Code) {
            setActivity(new Read());
        } else if (activity instanceof Read) {
            setActivity(new Sleep());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
