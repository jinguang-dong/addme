package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tze extends tpf implements tqs {
    public static final tze a;
    private static volatile tqy l;
    public int b;
    public long c;
    public long d;
    public int e;
    public toj f;
    public long g;
    public boolean h;
    public String i;
    public double j;
    public tzg k;
    private byte m = 2;

    static {
        tze tzeVar = new tze();
        a = tzeVar;
        tph.A(tze.class, tzeVar);
    }

    private tze() {
        trb trbVar = trb.a;
        toj tojVar = toj.b;
        this.f = toj.b;
        this.g = 180000L;
        tpi tpiVar = tpi.a;
        this.i = "";
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\t\u0000\u0001\u0001!\t\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0019ဇ\u0017\u001cဈ\u0018 က\u001a!ᐉ\u001c", new Object[]{oUZhwRhE.Rkh, "c", "f", "e", "g", "d", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new tze();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = l;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tze.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
