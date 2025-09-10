package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsb extends tph implements tqs {
    public static final gsb a;
    private static volatile tqy j;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public gsa h;
    public gsa i;

    static {
        gsb gsbVar = new gsb();
        a = gsbVar;
        tph.A(gsb.class, gsbVar);
    }

    private gsb() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000\u0007ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h", cdVQ.PPXnygyfDrIRygP});
        }
        if (i2 == 3) {
            return new gsb();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (gsb.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
