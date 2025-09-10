package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qno implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public qno(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(ueg.a.fr().h(((imm) this.a).b()));
            case 1:
                return Boolean.valueOf(ucz.a.fr().f(((imm) this.a).b()));
            case 2:
                return Boolean.valueOf(udu.a.fr().d(((imm) this.a).b()));
            case 3:
                return Boolean.valueOf(ueg.a.fr().i(((imm) this.a).b()));
            case 4:
                return Boolean.valueOf(udc.a.fr().c(((imm) this.a).b()));
            case 5:
                return Long.valueOf(udf.a.fr().a(((imm) this.a).b()));
            case 6:
                return Long.valueOf(udu.a.fr().b(((imm) this.a).b()));
            case 7:
                return udf.a.fr().b(((imm) this.a).b());
            case 8:
                return udf.a.fr().c(((imm) this.a).b());
            case 9:
                return Long.valueOf(ucz.a.fr().a(((imm) this.a).b()));
            case 10:
                return Long.valueOf(ucp.a.fr().a(((imm) this.a).b()));
            case 11:
                return Long.valueOf(ucp.a.fr().b(((imm) this.a).b()));
            case 12:
                return Long.valueOf(ucp.a.fr().d(((imm) this.a).b()));
            case 13:
                return Long.valueOf(ucp.a.fr().c(((imm) this.a).b()));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Long.valueOf(ueg.a.fr().a(((imm) this.a).b()));
            case 15:
                return Long.valueOf(ueg.a.fr().b(((imm) this.a).b()));
            case 16:
                return Long.valueOf(ueg.a.fr().c(((imm) this.a).b()));
            case 17:
                return Long.valueOf(ueg.a.fr().d(((imm) this.a).b()));
            case 18:
                return Boolean.valueOf(udi.a.fr().c(((imm) this.a).b()));
            case 19:
                return udi.a.fr().b(((imm) this.a).b());
            default:
                return udr.a.fr().a(((imm) this.a).b());
        }
    }
}
