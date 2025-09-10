package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.ViewStub;
import android.widget.PopupWindow;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.SnapshotButton;
import com.google.ar.core.R;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fnf implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fnf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v30, types: [gre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, mcz] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r1v23, types: [sgt, shi] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 1;
        switch (this.b) {
            case 0:
                fng fngVar = (fng) this.a;
                PopupWindow popupWindow = fngVar.f;
                if (popupWindow == null || !popupWindow.isShowing()) {
                    return;
                }
                PopupWindow popupWindow2 = fngVar.f;
                popupWindow2.getClass();
                popupWindow2.dismiss();
                return;
            case 1:
                fnc fncVar = (fnc) this.a;
                owf owfVar = fncVar.e;
                nkw nkwVar = (nkw) owfVar.dL();
                Activity activity = fncVar.a;
                fne fneVarA = fncVar.a(activity, nkwVar);
                if (fncVar.c.getAndSet(false)) {
                    int i4 = fneVarA.e;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i4 == 3) {
                        Optional optional = fneVarA.d;
                        if (optional.isPresent()) {
                            if (!((fnj) optional.get()).equals(fnj.SUPPORTED_INSTALLED)) {
                                fncVar.d(false);
                                fneVarA = fncVar.a(activity, (nkw) owfVar.dL());
                            }
                        }
                    }
                }
                fncVar.b.a(fneVarA);
                fncVar.d.a(true);
                return;
            case 2:
                ((fss) this.a).close();
                return;
            case 3:
                this.a.a();
                return;
            case 4:
                this.a.close();
                return;
            case 5:
                ((ftm) this.a).b();
                return;
            case 6:
                Object obj = this.a;
                try {
                    ((fvj) obj).f();
                    ((fvj) obj).h.e(true);
                    return;
                } catch (Exception e) {
                    ((fvj) obj).h.a(e);
                    return;
                }
            case 7:
                fvu fvuVar = (fvu) this.a;
                if (fvuVar.h) {
                    BottomBar bottomBar = fvuVar.a;
                    if (nlj.l(bottomBar.getContext()) && ((Boolean) fvuVar.d.dL()).booleanValue()) {
                        bottomBar.q(fvo.CENTER_RIGHT, rwc.j(bottomBar.n()));
                        fvuVar.k = true;
                        return;
                    } else {
                        if (fvuVar.k) {
                            bottomBar.q(fvo.CENTER_RIGHT, rvk.a);
                            fvuVar.k = false;
                            return;
                        }
                        return;
                    }
                }
                BottomBar bottomBar2 = fvuVar.a;
                if (nlj.l(bottomBar2.getContext()) && !((Boolean) fvuVar.d.dL()).booleanValue()) {
                    bottomBar2.q(fvo.RIGHT, fvuVar.e);
                    fvuVar.j = true;
                    return;
                } else {
                    if (fvuVar.j) {
                        bottomBar2.q(fvo.RIGHT, rvk.a);
                        fvuVar.j = false;
                        return;
                    }
                    return;
                }
            case 8:
                fvu fvuVar2 = (fvu) this.a.a();
                out.a();
                BottomBar bottomBar3 = fvuVar2.a;
                bottomBar3.p.b = new fvp(fvuVar2, i3);
                bottomBar3.o.setOnClickListener(new gx(fvuVar2, 19, bArr));
                bottomBar3.m().e = fvuVar2.m;
                bottomBar3.n.setOnClickListener(new gx(fvuVar2, 20, bArr));
                bottomBar3.n().setOnClickListener(new fvr(fvuVar2, i3));
                SnapshotButton snapshotButtonN = bottomBar3.n();
                snapshotButtonN.d = new fvw(snapshotButtonN, new ndc(snapshotButtonN));
                snapshotButtonN.l(true);
                int i5 = 2;
                bottomBar3.k().setOnClickListener(new fvp(fvuVar2, i5));
                bottomBar3.h().setOnClickListener(new fvr(fvuVar2, i2));
                bottomBar3.i().setOnClickListener(new fvr(fvuVar2, i5));
                bottomBar3.l().setOnClickListener(new fvr(fvuVar2, i));
                bottomBar3.j().setOnClickListener(new fvp(fvuVar2, i));
                fvuVar2.m(true);
                return;
            case 9:
                ((gop) this.a).b.w().a();
                return;
            case 10:
                out.a();
                got gotVar = (got) this.a;
                ?? r1 = gotVar.c;
                r1.f("GleamUiWirer#wire");
                ViewStub viewStub = (ViewStub) ((ocq) gotVar.b).c(R.id.gleam_stub);
                viewStub.setLayoutResource(R.layout.new_qr_gleaming_view);
                gotVar.a.g(viewStub.inflate());
                r1.g();
                return;
            case 11:
                ((khb) this.a).d();
                return;
            case 12:
                ((gsz) this.a).m();
                return;
            case 13:
                ((gsz) this.a).e();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((gsz) this.a).k();
                return;
            case 15:
                this.a.a();
                return;
            case 16:
                ?? r0 = this.a;
                ((gwv) r0).a.k(r0);
                return;
            case 17:
                Object obj2 = this.a;
                hbw hbwVar = (hbw) obj2;
                pbn pbnVar = hbwVar.g;
                pbnVar.f("CameraFilmstripDataAdapter#queryFilmStrip");
                Instant instantH = hbwVar.h ? hbwVar.l : Instant.EPOCH;
                fqb fqbVarB = hbwVar.o().b();
                Instant instantG = fqbVarB != null ? fqbVarB.a().g() : instantH;
                if (fqbVarB != null) {
                    instantH = fqbVarB.a().h();
                }
                pbnVar.f("CameraFilmstripDataAdapter#queryFilmStrip#querySince");
                try {
                    int i6 = sbp.d;
                    sbk sbkVar = new sbk();
                    hcl hclVar = ((hbw) obj2).e;
                    hcf hcfVar = hclVar.c;
                    Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    String[] strArr = hcf.c;
                    sbkVar.j((List) Collection.EL.stream(hcfVar.d(uri, strArr, instantG.toEpochMilli(), instantH.getEpochSecond(), 5, new fiy(hcfVar, 14))).map(new fiy(hclVar, 15)).collect(Collectors.toList()));
                    pmv pmvVar = ((hbw) obj2).r;
                    Object obj3 = pmvVar.d;
                    sbkVar.j((List) Collection.EL.stream(((hcf) obj3).d(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, strArr, instantG.toEpochMilli(), instantH.getEpochSecond(), 5, new fiy(obj3, 13))).map(new fiy(pmvVar, 16)).collect(Collectors.toList()));
                    sbp sbpVarG = sbkVar.g();
                    int i7 = ((sex) sbpVarG).c;
                    pbnVar.h("CameraFilmstripDataAdapter#queryFilmStrip#loadMetadata");
                    sgk it = sbpVarG.iterator();
                    while (it.hasNext()) {
                        ((hbw) obj2).s.J(((hbw) obj2).d, (fqb) it.next());
                    }
                    hcj hcjVar = ((hbw) obj2).i;
                    if (hcjVar.a() == 0) {
                        hcjVar.h(sbpVarG);
                    } else {
                        sgk it2 = sbpVarG.iterator();
                        while (it2.hasNext()) {
                            hcjVar.l((fqb) it2.next());
                        }
                    }
                    return;
                } finally {
                    pbn pbnVar2 = hbwVar.g;
                    pbnVar2.g();
                    pbnVar2.g();
                }
            case 18:
                try {
                    lsa lsaVar = ((hbx) this.a).b;
                    lsaVar.b(false);
                    if (lsaVar.c.p(gzo.bn)) {
                        lsaVar.b(true);
                        return;
                    }
                    return;
                } catch (IOException e2) {
                    ((sgt) ((sgt) hbx.a.b().i(e2)).M((char) 1145)).s("Failed to restore JPEG files");
                    return;
                }
            case 19:
                hfn hfnVar = (hfn) this.a;
                hfnVar.b();
                hfnVar.c();
                return;
            default:
                ((hfq) this.a).b();
                return;
        }
    }
}
