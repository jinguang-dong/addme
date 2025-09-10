package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyw implements lzm {
    final /* synthetic */ lzm a;
    final /* synthetic */ lyy b;

    public lyw(lyy lyyVar, lzm lzmVar) {
        this.a = lzmVar;
        this.b = lyyVar;
    }

    @Override // defpackage.lzm
    public final void a() {
        lyz lyzVar = (lyz) this.a;
        lza lzaVar = lyzVar.c;
        imi imiVar = lzaVar.f;
        Object obj = imi.a;
        lzh lzhVar = lyzVar.b;
        synchronized (obj) {
            for (imj imjVar : (imj[]) imiVar.d.toArray(new imj[0])) {
                if (lzhVar.equals(imjVar.e())) {
                    imiVar.f(imjVar);
                }
            }
        }
        lzaVar.b.remove(lzhVar);
    }

    @Override // defpackage.lzm
    public final void b(lzl lzlVar) {
        if (this.b.e) {
            lyz lyzVar = (lyz) this.a;
            lza lzaVar = lyzVar.c;
            ktx ktxVar = lzaVar.e;
            owf owfVar = lzaVar.d;
            lzh lzhVar = lyzVar.b;
            lyr lyrVar = new lyr(lyzVar.a, lzhVar, lzlVar, lzaVar.g, lzaVar.k, ktxVar, lzaVar.h, lzaVar.j, owfVar, lzaVar.i);
            lzaVar.f.a(lyrVar);
            lzaVar.b.put(lzhVar, lyrVar);
        }
    }

    @Override // defpackage.lzm
    public final void c(lzl lzlVar) {
        if (this.b.e) {
            lyz lyzVar = (lyz) this.a;
            lzh lzhVar = lyzVar.b;
            lza lzaVar = lyzVar.c;
            lyr lyrVar = (lyr) lzaVar.b.get(lzhVar);
            if (lyrVar != null) {
                lzaVar.c.c(new lsn(lyrVar, lzlVar, 6));
            }
        }
    }
}
