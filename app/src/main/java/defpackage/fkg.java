package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fkg {
    public static final sgv a = sgv.g("fkg");

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(tfc.NONE, Integer.valueOf(R.string.direction_none));
        sbrVar.f(tfc.LEFT, Integer.valueOf(R.string.direction_left));
        sbrVar.f(tfc.RIGHT, Integer.valueOf(R.string.direction_right));
        sbrVar.f(tfc.FORWARD, Integer.valueOf(R.string.direction_forward));
        sbrVar.f(tfc.BACKWARD, Integer.valueOf(R.string.direction_backward));
        sbrVar.f(tfc.UP, Integer.valueOf(R.string.direction_up));
        sbrVar.f(tfc.DOWN, Integer.valueOf(R.string.direction_down));
        tfc tfcVar = tfc.TURN_AROUND;
        Integer numValueOf = Integer.valueOf(R.string.direction_turn_around);
        sbrVar.f(tfcVar, numValueOf);
        sbrVar.f(tfc.POINT_AT_SCENE, numValueOf);
        sbrVar.f(tfc.POINT_AT_SCENE_CLOSE, numValueOf);
        sbrVar.b();
    }
}
