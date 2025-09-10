package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcs {
    private static final scn a = scn.L(nkw.PHOTO, nkw.NIGHT_SIGHT, nkw.PORTRAIT, nkw.SERENGETI, nkw.ACTION_PAN, nkw.LANDSCAPE, nkw.COTTAGE);
    private final lbb b;
    private final nms c;
    private final kfi d;
    private final long e;
    private final boolean f;
    private final nkw g;
    private final owf h;
    private final jho i;
    private final hbj j;

    public lcs(jho jhoVar, lbb lbbVar, nms nmsVar, hbj hbjVar, kfi kfiVar, pmj pmjVar, boolean z, nkw nkwVar, owf owfVar) {
        this.i = jhoVar;
        this.b = lbbVar;
        this.c = nmsVar;
        this.j = hbjVar;
        this.d = kfiVar;
        this.e = pmjVar.b;
        this.f = z;
        this.g = nkwVar;
        this.h = owfVar;
    }

    public final int a(pko pkoVar) {
        long jAx = this.e / qpt.ax(pkoVar.a, pkoVar.b);
        int i = (int) jAx;
        if (jAx == i) {
            return Math.min(i, this.d.b);
        }
        throw new ArithmeticException();
    }

    public final boolean b(lcz lczVar, pjo pjoVar) {
        if (pjoVar == null) {
            return false;
        }
        lcz lczVar2 = lcz.a;
        int iOrdinal = lczVar.ordinal();
        if (iOrdinal == 3) {
            if (this.f) {
                jho jhoVar = this.i;
                if (jhoVar.d(true, this.g) && !jhoVar.d) {
                    return false;
                }
            }
            return true;
        }
        if (iOrdinal == 5) {
            nms nmsVar = this.c;
            lbb lbbVar = this.b;
            boolean z = this.f;
            if (lbbVar.c(lcz.RAW_WIDE, nmsVar.g(), z).a == 38) {
                return false;
            }
            return !z || this.i.d(true, this.g);
        }
        if (iOrdinal == 12) {
            ((Boolean) this.h.dL()).booleanValue();
            return false;
        }
        if (iOrdinal != 20) {
            throw new IllegalArgumentException("Unsupported stream: ".concat(String.valueOf(String.valueOf(lczVar))));
        }
        if (a.contains(this.g)) {
            gzi gziVar = hae.a;
        }
        return false;
    }
}
