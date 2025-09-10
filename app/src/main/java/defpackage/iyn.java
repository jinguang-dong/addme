package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iyn implements paf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iyn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v1, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r4v20, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, pdn] */
    @Override // defpackage.paf
    public final void a(Object obj) throws Resources.NotFoundException {
        switch (this.b) {
            case 0:
                fpy fpyVar = (fpy) obj;
                fpyVar.getClass();
                rnt.L(fpyVar.c == null);
                ?? r4 = this.a;
                fpyVar.c = r4;
                iyu iyuVar = (iyu) r4;
                fpyVar.g.add(iyuVar.B);
                iyuVar.I.j().d(new ffx(r4, fpyVar, 15, null));
                return;
            case 1:
                gzi gziVar = gzo.a;
                Object obj2 = ((gno) this.a).b;
                return;
            case 2:
                fel felVar = (fel) obj;
                felVar.getClass();
                felVar.c();
                ((jbc) this.a).aj.i().d(new hye(felVar, 10));
                return;
            case 3:
                ((jbc) this.a).ad.a(juk.b);
                return;
            case 4:
                Object obj3 = this.a;
                mgn mgnVar = (mgn) obj;
                synchronized (obj3) {
                    gzi gziVar2 = gzo.a;
                    mgnVar.getClass();
                    ((owd) obj3).a = mgnVar.b();
                }
                return;
            case 5:
                mgn mgnVar2 = (mgn) obj;
                uh uhVar = (uh) this.a;
                if (((fdq) uhVar.i).g()) {
                    return;
                }
                rnt.x(mgnVar2);
                if (!mgnVar2.a()) {
                    ((ocq) uhVar.a).ac(uhVar.e).show();
                    return;
                } else {
                    ((mgj) uhVar.c.a()).a(mgnVar2);
                    ((mgi) uhVar.h.a()).b(mgnVar2);
                    return;
                }
            case 6:
                ((kli) this.a).d.e(fsq.k);
                return;
            case 7:
                rwc rwcVar = (rwc) obj;
                rnt.x(rwcVar);
                if (rwcVar.h()) {
                    this.a.q((rnu) rwcVar.c());
                    return;
                }
                return;
            case 8:
                ram ramVar = (ram) obj;
                ramVar.getClass();
                if (myi.b(ramVar)) {
                    return;
                }
                Object obj4 = this.a;
                out.a();
                myi myiVar = (myi) obj4;
                myl mylVar = myiVar.b;
                mylVar.h.d(myiVar.e.b(new myk(mylVar)));
                return;
            default:
                njz njzVar = (njz) this.a;
                if (((Boolean) njzVar.k.dL()).booleanValue() || ((Boolean) njzVar.i.dL()).booleanValue()) {
                    return;
                }
                njzVar.m.j();
                return;
        }
    }
}
