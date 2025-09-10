package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qnn implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public qnn(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(ucp.a.fr().f(((imm) this.a).b()));
            case 1:
                qtk qtkVar = (qtk) ((uem) ((jaf) this.a).b().e(new pmt(3))).a();
                qtkVar.getClass();
                return qtkVar;
            case 2:
                return ucp.a.fr().e(((imm) this.a).b());
            case 3:
                return Boolean.valueOf(udo.a.fr().a(((imm) this.a).b()));
            case 4:
                return Boolean.valueOf(udo.a.fr().b(((imm) this.a).b()));
            case 5:
                return Boolean.valueOf(udo.a.fr().c(((imm) this.a).b()));
            case 6:
                return Boolean.valueOf(udo.a.fr().d(((imm) this.a).b()));
            case 7:
                return ucs.a.fr().a(((imm) this.a).b());
            case 8:
                return Boolean.valueOf(ueg.a.fr().g(((imm) this.a).b()));
            case 9:
                return Boolean.valueOf(udf.a.fr().d(((imm) this.a).b()));
            case 10:
                return Long.valueOf(udu.a.fr().a(((imm) this.a).b()));
            case 11:
                return ucw.a.fr().a(((imm) this.a).b());
            case 12:
                return ucz.a.fr().b(((imm) this.a).b());
            case 13:
                return ucz.a.fr().d(((imm) this.a).b());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Boolean.valueOf(ucz.a.fr().e(((imm) this.a).b()));
            case 15:
                return Boolean.valueOf(ucp.a.fr().g(((imm) this.a).b()));
            case 16:
                return Boolean.valueOf(ucp.a.fr().h(((imm) this.a).b()));
            case 17:
                return Boolean.valueOf(ucp.a.fr().i(((imm) this.a).b()));
            case 18:
                return Boolean.valueOf(ucp.a.fr().j(((imm) this.a).b()));
            case 19:
                return Boolean.valueOf(udc.a.fr().a(((imm) this.a).b()));
            default:
                return Boolean.valueOf(udc.a.fr().b(((imm) this.a).b()));
        }
    }
}
