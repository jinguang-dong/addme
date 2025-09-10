package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tuh extends tpf implements tqs {
    public static final tuh a;
    private static volatile tqy f;
    public int b;
    public Object d;
    public int c = 0;
    private byte g = 2;
    public String e = INRGuObcrHjSQz.UWjVRfEiRFb;

    static {
        tuh tuhVar = new tuh();
        a = tuhVar;
        tph.A(tuh.class, tuhVar);
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002м\u0000", new Object[]{"d", "c", "b", oUZhwRhE.ckh, tty.class});
        }
        if (i2 == 3) {
            return new tuh();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tuh.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }

    private tuh() {
    }
}
