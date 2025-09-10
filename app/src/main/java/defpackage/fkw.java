package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkw implements kfb {
    private final /* synthetic */ int a;
    private final Object b;

    public fkw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, tzx] */
    @Override // defpackage.kfb
    public final /* synthetic */ Object a(qin qinVar) {
        int i = this.a;
        if (i == 0) {
            iso isoVar = (iso) this.b;
            return new fkv(qinVar, (fkw) ((tzu) isoVar.b).a, (swb) isoVar.a.a());
        }
        if (i == 1) {
            gny gnyVar = (gny) this.b;
            return new fkl(qinVar, (fja) gnyVar.f.a(), (owf) gnyVar.c.a(), (owf) gnyVar.g.a(), (jod) gnyVar.d.a(), (owq) gnyVar.a.a(), (fkw) ((tzu) gnyVar.b).a, (sbp) gnyVar.h.a(), (Consumer) gnyVar.e.a());
        }
        if (i == 2) {
            return new fkz(qinVar, (fkw) ((tzu) ((pfl) this.b).a).a);
        }
        if (i != 3) {
            return i != 4 ? new obu(((imm) ((pfl) this.b).a).b(), (Object) qinVar) : new flf(qinVar, (fkw) ((tzu) ((pfl) this.b).a).a);
        }
        iso isoVar2 = (iso) this.b;
        return new fld(qinVar, (fkw) ((tzu) isoVar2.a).a, (owf) isoVar2.b.a());
    }
}
