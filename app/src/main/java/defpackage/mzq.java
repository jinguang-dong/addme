package defpackage;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.text.TextUtils;
import android.transition.Fade;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.PopupWindow;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.UUID;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mzq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mzq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r14v18, types: [imj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19, types: [imj, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        PopupWindow popupWindow;
        View view;
        int i = 0;
        switch (this.c) {
            case 0:
                sgv sgvVar = mzy.a;
                rwc rwcVar = (rwc) this.a;
                if (rwcVar.h()) {
                    rwcVar.c().run();
                }
                this.b.run();
                return;
            case 1:
                Object obj = this.b;
                Object obj2 = this.a;
                if (obj != ram.UNSUPPORTED_FOR_USER && obj != ram.UNSUPPORTED_FOR_DEVICE) {
                    nbb nbbVar = ((myl) ((jcb) obj2).a).f;
                    nbbVar.getClass();
                    nbc nbcVar = nbbVar.c;
                    nbe nbeVarB = nbcVar.getItem(nbcVar.a(ltg.MARS_STORE));
                    if (nbeVarB.j) {
                        return;
                    }
                    nbd nbdVar = new nbd(nbeVarB);
                    nbdVar.f(true);
                    nbcVar.c(nbdVar.a());
                    return;
                }
                nbb nbbVar2 = ((myl) ((jcb) obj2).a).f;
                nbbVar2.getClass();
                nbc nbcVar2 = nbbVar2.c;
                ltg ltgVar = ltg.MARS_STORE;
                ltg ltgVar2 = ltg.MEDIA_STORE;
                nbe nbeVarB2 = nbcVar2.getItem(nbcVar2.a(ltgVar));
                if (nbeVarB2.j) {
                    nbd nbdVar2 = new nbd(nbeVarB2);
                    nbdVar2.f(false);
                    nbcVar2.c(nbdVar2.a());
                    Object obj3 = nbcVar2.b;
                    if (obj3 == null || obj3 != ltgVar) {
                        return;
                    }
                    nbbVar2.c(ltgVar2);
                    return;
                }
                return;
            case 2:
                String str = ((nbe) this.b).b;
                nbb nbbVar3 = (nbb) this.a;
                nbbVar3.q.h(nbbVar3.a.getResources().getString(R.string.menu_selected_accessibility_announce, str));
                return;
            case 3:
                PopupWindow popupWindow2 = ((nfk) this.b).f;
                if (popupWindow2 == null || !popupWindow2.isShowing()) {
                    return;
                }
                nfd nfdVar = (nfd) this.a;
                nfdVar.b.execute(nfdVar.a);
                return;
            case 4:
                ((nfh) this.b).l.f(this.a);
                return;
            case 5:
                ((nfh) this.b).l.f(this.a);
                return;
            case 6:
                ((nfh) this.b).b((nfe) this.a);
                return;
            case 7:
                Object obj4 = this.a;
                Object obj5 = ((nfk) obj4).q;
                Object obj6 = this.b;
                synchronized (obj5) {
                    Activity activity = (Activity) ((WeakReference) obj6).get();
                    if (activity != null && !activity.isFinishing() && (popupWindow = ((nfk) obj4).f) != null && (view = ((nfk) obj4).k) != null) {
                        popupWindow.showAtLocation(view, 0, 0, 0);
                    }
                }
                return;
            case 8:
                Object obj7 = this.a;
                Object obj8 = ((nfk) obj7).q;
                Object obj9 = this.b;
                synchronized (obj8) {
                    PopupWindow popupWindow3 = ((nfk) obj7).f;
                    Activity activity2 = (Activity) ((WeakReference) obj9).get();
                    if (activity2 != null && !activity2.isFinishing() && popupWindow3 != null) {
                        Fade fade = new Fade();
                        fade.setDuration(((nfk) obj7).t);
                        fade.setInterpolator(new cvn());
                        popupWindow3.setExitTransition(fade);
                    }
                }
                return;
            case 9:
                ((DisplayManager) this.a).unregisterDisplayListener(((nfk) this.b).w);
                return;
            case 10:
                ((jgt) this.a).k(this.b);
                return;
            case 11:
                out.a();
                ((MainActivityLayout) this.a).o.remove(((njz) ((mlf) this.b).a).p);
                return;
            case 12:
                out.b();
                Object obj10 = this.a;
                Object obj11 = ((mwq) this.b).a;
                nnc nncVar = (nnc) obj11;
                Uri uri = (Uri) obj10;
                if (nncVar.a(uri) == null) {
                    DownloadManager.Request request = new DownloadManager.Request(uri);
                    String string = UUID.randomUUID().toString();
                    Context context = nncVar.d;
                    request.setDestinationUri(Uri.fromFile(new File(context.getExternalFilesDir(null), string)));
                    if (context.checkSelfPermission("android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                        request.setNotificationVisibility(2);
                    }
                    long jEnqueue = nncVar.c.enqueue(request);
                    Long.valueOf(jEnqueue).getClass();
                    synchronized (((nnb) obj11).b) {
                        SharedPreferences.Editor editorEdit = ((nnb) obj11).a.edit();
                        editorEdit.putLong(((Uri) obj10).toString(), jEnqueue);
                        editorEdit.apply();
                    }
                    return;
                }
                return;
            case 13:
                out.b();
                Object obj12 = this.a;
                Object obj13 = ((mwq) this.b).a;
                nnc nncVar2 = (nnc) obj13;
                Long lA = nncVar2.a((Uri) obj12);
                if (lA != null) {
                    nncVar2.c.remove(lA.longValue());
                    synchronized (((nnb) obj13).b) {
                        SharedPreferences.Editor editorEdit2 = ((nnb) obj13).a.edit();
                        editorEdit2.remove(((Uri) obj12).toString());
                        editorEdit2.apply();
                    }
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj14 = this.b;
                Object obj15 = this.a;
                if (TextUtils.isEmpty(((nss) obj15).b)) {
                    ((nss) obj15).b = ((nss) obj15).a();
                }
                String str2 = ((nss) obj15).b;
                if (TextUtils.isEmpty(str2)) {
                    ((sgt) nss.a.c().M(5516)).s("findBestNodeAndSendMessageAsync() failed because can't find node");
                    return;
                } else {
                    ((nss) obj15).e(str2, (String) obj14, null);
                    return;
                }
            case 15:
                ((ntf) this.a).k.d((String) this.b, null);
                return;
            case 16:
                ((ntf) this.a).k.d((String) this.b, null);
                return;
            case 17:
                ((ntf) this.a).k.d((String) this.b, null);
                return;
            case 18:
                ?? r0 = this.b;
                int size = r0.size();
                while (i < size) {
                    nxa nxaVar = (nxa) r0.get(i);
                    Object obj16 = this.a;
                    lg lgVar = nxaVar.a;
                    nxb nxbVar = (nxb) obj16;
                    ViewPropertyAnimator viewPropertyAnimatorV = nxbVar.v(lgVar, nxaVar.b, nxaVar.c, nxaVar.d, nxaVar.e);
                    nxbVar.p.add(lgVar);
                    viewPropertyAnimatorV.setDuration(((kn) obj16).j).setListener(new nww(nxbVar, lgVar, viewPropertyAnimatorV)).start();
                    i++;
                }
                ((ArrayList) r0).clear();
                ((nxb) this.a).m.remove((Object) r0);
                return;
            case 19:
                ?? r02 = this.b;
                int size2 = r02.size();
                while (i < size2) {
                    nwz nwzVar = (nwz) r02.get(i);
                    Object obj17 = this.a;
                    lg lgVar2 = nwzVar.a;
                    View view2 = lgVar2 == null ? null : lgVar2.a;
                    lg lgVar3 = nwzVar.b;
                    View view3 = lgVar3 != null ? lgVar3.a : null;
                    if (view2 != null) {
                        nxb nxbVar2 = (nxb) obj17;
                        ViewPropertyAnimator viewPropertyAnimatorU = nxbVar2.u(lgVar2);
                        viewPropertyAnimatorU.setDuration(((kn) obj17).k);
                        nxbVar2.r.add(lgVar2);
                        viewPropertyAnimatorU.translationX(nwzVar.e - nwzVar.c);
                        viewPropertyAnimatorU.translationY(nwzVar.f - nwzVar.d);
                        viewPropertyAnimatorU.setListener(new nwx(nxbVar2, lgVar2, viewPropertyAnimatorU, view2)).start();
                    }
                    if (view3 != null) {
                        nxb nxbVar3 = (nxb) obj17;
                        ViewPropertyAnimator viewPropertyAnimatorT = nxbVar3.t(lgVar3);
                        nxbVar3.r.add(lgVar3);
                        viewPropertyAnimatorT.translationX(0.0f).translationY(0.0f);
                        viewPropertyAnimatorT.setDuration(((kn) obj17).k);
                        viewPropertyAnimatorT.setListener(new nwy(nxbVar3, lgVar3, viewPropertyAnimatorT)).start();
                    }
                    i++;
                }
                ((ArrayList) r02).clear();
                ((nxb) this.a).n.remove((Object) r02);
                return;
            default:
                ?? r03 = this.b;
                int size3 = r03.size();
                while (i < size3) {
                    lg lgVar4 = (lg) r03.get(i);
                    Object obj18 = this.a;
                    nxb nxbVar4 = (nxb) obj18;
                    ViewPropertyAnimator viewPropertyAnimatorA = nxbVar4.a(lgVar4);
                    nxbVar4.o.add(lgVar4);
                    viewPropertyAnimatorA.setDuration(((kn) obj18).h).setListener(new nwv(nxbVar4, lgVar4, viewPropertyAnimatorA)).start();
                    i++;
                }
                ((ArrayList) r03).clear();
                ((nxb) this.a).g.remove((Object) r03);
                return;
        }
    }

    public /* synthetic */ mzq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public mzq(nxb nxbVar, ArrayList arrayList, int i) {
        this.c = i;
        this.b = arrayList;
        this.a = nxbVar;
    }
}
