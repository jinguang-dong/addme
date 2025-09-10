package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tda {
    public static final tda a;
    public static final tda b;
    public static final tda c;
    public static final tda d;
    private static int f;
    public final int e;
    private final String g;

    private tda() {
        this.g = "kInvalid";
        this.e = 0;
        f = 1;
    }

    public final String toString() {
        return this.g;
    }

    static {
        new tda();
        a = new tda("kHdrPlusOn");
        new tda("kHdrPlusEnhanced");
        b = new tda("kPortrait");
        c = new tda("kNightSight");
        new tda("kThirdParty");
        d = new tda(cdVQ.jcJuCrFXPZJ);
        f = 0;
    }

    private tda(String str) {
        this.g = str;
        int i = f;
        f = i + 1;
        this.e = i;
    }
}
