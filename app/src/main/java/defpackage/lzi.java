package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzi {
    public String a;
    public owf b;
    public rwc c;
    public rwc d;
    public int e;
    private scn f;
    private scn g;
    private boolean h;
    private boolean i;
    private byte j;

    public lzi() {
        throw null;
    }

    public final lzj a() {
        String str;
        scn scnVar;
        scn scnVar2;
        owf owfVar;
        int i;
        if (this.j != 3 || (str = this.a) == null || (scnVar = this.f) == null || (scnVar2 = this.g) == null || (owfVar = this.b) == null || (i = this.e) == 0) {
            throw new IllegalStateException();
        }
        lzj lzjVar = new lzj(str, scnVar, scnVar2, this.h, this.i, owfVar, i, this.c, this.d);
        rnt.B(lzjVar.a.length() <= 32, "Smarts Processor name is too long.");
        rnt.L(!lzjVar.b.isEmpty());
        rnt.L(!lzjVar.c.isEmpty());
        return lzjVar;
    }

    public final void b(scn scnVar) {
        scnVar.getClass();
        this.g = scnVar;
    }

    public final void c(scn scnVar) {
        scnVar.getClass();
        this.f = scnVar;
    }

    public final void d(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 1);
    }

    public final void e(boolean z) {
        this.i = z;
        this.j = (byte) (this.j | 2);
    }

    public lzi(byte[] bArr) {
        rvk rvkVar = rvk.a;
        this.c = rvkVar;
        this.d = rvkVar;
    }
}
