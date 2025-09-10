package defpackage;

import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import com.google.ar.core.R;
import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrj implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;
    private final Object c;

    public mrj(Object obj, tzx tzxVar, int i) {
        this.b = i;
        this.c = obj;
        this.a = tzxVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v55, types: [java.lang.Object, uem] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new mri((mrx) this.a.a(), (moy) this.c.a());
            case 1:
                tzx tzxVar = this.a;
                ngw ngwVarA = ((ngx) this.c).a();
                hbj hbjVar = (hbj) tzxVar.a();
                Object obj = ngwVarA.n;
                rnt.x(obj);
                return new nks((ZoomLockView) obj, hbjVar);
            case 2:
                return ((hbj) this.a.a()).p(gzo.by) ? new jjy(((ngy) this.c).a(), 5) : new gnc(6);
            case 3:
                return ((hbj) this.c.a()).p(gza.s) ? Optional.of((mtw) this.a.a()) : Optional.empty();
            case 4:
                return new qpt((byte[]) null);
            case 5:
                return ((hbj) this.a.a()).p(gzt.a) ? ((jaf) this.c).b() : rvk.a;
            case 6:
                gzg gzgVar = gzt.a;
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case 7:
                our ourVar = (our) this.c.a();
                mwp mwpVar = (mwp) this.a.a();
                mwpVar.getClass();
                ourVar.d(new khc(mwpVar, 20));
                sfd sfdVar2 = sfd.a;
                sfdVar2.getClass();
                return sfdVar2;
            case 8:
                return new nby(((imm) this.c).b(), (lpd) this.a.a());
            case 9:
                scn scnVarH = scn.H((owf) this.a.a(), (owf) this.c.a());
                scnVarH.getClass();
                return scnVarH;
            case 10:
                return new mwq(((imz) this.a).a(), ((ocq) ((ngw) ((ocq) this.c).a).j).c(R.id.root_live_region_view), (char[]) null);
            case 11:
                return new njm((hrj) this.c.a(), this.a, 0);
            case 12:
                return new njm((rwc) this.c.a(), ((imm) this.a).b(), 2);
            case 13:
                return new njm((khb) this.c.a(), this.a, 3);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new njm((mny) this.a.a(), (uem) this.c, 4);
            case 15:
                return new njm((muu) this.a.a(), (uem) this.c, 5);
            case 16:
                return new njm((muu) this.a.a(), (uem) this.c, 6);
            case 17:
                return new njm((muu) this.a.a(), (uem) this.c, 7);
            case 18:
                return new njm((lmx) this.a.a(), (uem) this.c, 8);
            case 19:
                return new njm((uem) this.c, (krn) this.a.a(), 9);
            default:
                return new njl(((tzz) this.a).a(), (pbn) this.c.a());
        }
    }

    public mrj(tzx tzxVar, tzx tzxVar2, int i) {
        this.b = i;
        this.a = tzxVar;
        this.c = tzxVar2;
    }
}
