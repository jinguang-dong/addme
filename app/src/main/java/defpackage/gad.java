package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gad implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public gad(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    public static rwc c(uem uemVar, hbj hbjVar) {
        return hbjVar.p(hac.T) ? ((jaf) uemVar).b() : rvk.a;
    }

    public static rwc d(uem uemVar, hbj hbjVar) {
        return hbjVar.p(gzs.F) ? ((jaf) uemVar).b() : rvk.a;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.c) {
        }
        return b();
    }

    public final rwc b() {
        switch (this.c) {
            case 0:
                return ((hbj) this.b.a()).p(gym.aa) ? ((jaf) this.a).b() : rvk.a;
            case 1:
                return !((fgn) this.a.a()).b ? rvk.a : rwc.j((fgx) this.b.a());
            case 2:
                return ((hbj) this.b.a()).p(gym.aa) ? ((jaf) this.a).b() : rvk.a;
            case 3:
                return ((hbj) this.a.a()).p(gym.K) ? ((jaf) this.b).b() : rvk.a;
            case 4:
                return ((koh) this.a).b().booleanValue() ? ((jaf) this.b).b() : rvk.a;
            case 5:
                return ((koh) this.a).b().booleanValue() ? ((jaf) this.b).b() : rvk.a;
            case 6:
                rwc rwcVarW = a.W(this.a, ((Boolean) this.b.a()).booleanValue());
                rwcVarW.getClass();
                return rwcVarW;
            case 7:
                return a.X(this.a, ((Boolean) this.b.a()).booleanValue());
            case 8:
                return a.X(this.a, ((Boolean) this.b.a()).booleanValue());
            case 9:
                return c(this.a, (hbj) this.b.a());
            case 10:
                return ((hbj) this.a.a()).p(hab.d) ? ((jaf) this.b).b() : rvk.a;
            case 11:
                return !((hfg) this.b).a().m() ? rvk.a : ((jaf) this.a).b();
            case 12:
                return !((hfg) this.b).a().m() ? rvk.a : ((jaf) this.a).b();
            case 13:
                rwc rwcVar = ((hfg) this.a).a().m() ? (rwc) this.b.a() : rvk.a;
                rwcVar.getClass();
                return rwcVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                tzx tzxVar = this.a;
                iso isoVarB = ((hfg) this.b).a();
                rwc rwcVar2 = (rwc) tzxVar.a();
                return !isoVarB.n() ? rvk.a : !rwcVar2.h() ? rvk.a : rwc.j((kal) ((uem) rwcVar2.c()).a());
            case 15:
                return ((hbj) this.b.a()).p(haw.n) ? ((jaf) this.a).b() : rvk.a;
            case 16:
                return ((hbj) this.b.a()).p(hac.M) ? rwc.j((kej) this.a.a()) : rvk.a;
            case 17:
                return d(this.b, (hbj) this.a.a());
            case 18:
                return ((hbj) this.b.a()).p(haz.a) ? ((jaf) this.a).b() : rvk.a;
            case 19:
                return ((hef) this.b).b().booleanValue() ? ((jaf) this.a).b() : rvk.a;
            default:
                return ((Integer) ((hbj) this.a.a()).a(ham.a).get()).intValue() != 0 ? ((jaf) this.b).b() : rvk.a;
        }
    }

    public gad(tzx tzxVar, tzx tzxVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
