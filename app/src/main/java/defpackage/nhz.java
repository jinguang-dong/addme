package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.ComposeView;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.ar.core.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhz {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable, java.lang.Object] */
    public nhz(gko gkoVar) {
        Object obj = gkoVar.b;
        this.f = obj;
        this.c = gkoVar.f;
        String str = ((ebx) obj).b;
        this.g = str;
        this.e = gkoVar.a;
        this.j = gkoVar.c;
        Object obj2 = gkoVar.e;
        this.k = obj2;
        this.b = ((WorkDatabase) obj2).B();
        this.i = ((WorkDatabase) obj2).w();
        ?? r2 = gkoVar.d;
        this.d = r2;
        this.h = "Work [ id=" + str + ", tags={ " + ske.ca(r2, ",", null, null, null, 62) + cdVQ.LbayHNxEsNP;
        this.a = new uon(null);
    }

    public final float a() {
        return ((gox) this.a).o();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bbo, java.lang.Object] */
    public final mxm b() {
        return (mxm) this.i.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void c(nja njaVar) {
        this.g.add(njaVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [azr, java.lang.Object] */
    public final void d(mxm mxmVar) {
        mxmVar.getClass();
        this.h.b(b());
        this.i.b(mxmVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azr, java.lang.Object] */
    public final void e(String str) {
        str.getClass();
        this.b.b(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [azr, java.lang.Object] */
    public final void f(nhy nhyVar) {
        this.c.b(nhyVar);
        ((gox) this.a).r(new niy(nhyVar));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Set] */
    public final void g(float f, boolean z, niz nizVar) {
        nizVar.getClass();
        ((gox) this.a).s(ukc.m(f, 0.0f, 1.0f));
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((nja) it.next()).a(a(), z, nizVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.uhb r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhz.i(uhb):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eby, java.lang.Object] */
    public final void j(int i) {
        String str = (String) this.g;
        ?? r1 = this.b;
        r1.m(1, str);
        r1.g(str, System.currentTimeMillis());
        r1.f(str, ((ebx) this.f).t);
        r1.k(str, -1L);
        r1.i(str, i);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eby, java.lang.Object] */
    public final void k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = this.g;
        ?? r3 = this.b;
        String str = (String) obj;
        r3.g(str, jCurrentTimeMillis);
        r3.m(1, str);
        ecr ecrVar = (ecr) r3;
        dco dcoVar = ecrVar.a;
        dcoVar.k();
        dfq dfqVarD = ecrVar.g.d();
        dfqVarD.g(1, str);
        try {
            dcoVar.l();
            try {
                dfqVarD.a();
                dcoVar.p();
                ecrVar.g.f(dfqVarD);
                r3.f(str, ((ebx) this.f).t);
                dco dcoVar2 = ecrVar.a;
                dcoVar2.k();
                dfq dfqVarD2 = ecrVar.e.d();
                dfqVarD2.g(1, str);
                try {
                    dcoVar2.l();
                    try {
                        dfqVarD2.a();
                        dcoVar2.p();
                        ecrVar.e.f(dfqVarD2);
                        r3.k(str, -1L);
                    } finally {
                    }
                } catch (Throwable th) {
                    ecrVar.e.f(dfqVarD2);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            ecrVar.g.f(dfqVarD);
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eay, java.lang.Object] */
    public final void l(cpn cpnVar) {
        String str = (String) this.g;
        List listBn = ske.bn(str);
        while (!listBn.isEmpty()) {
            String str2 = (String) ske.bt(listBn);
            ?? r3 = this.b;
            if (r3.l(str2) != 6) {
                r3.m(4, str2);
            }
            listBn.addAll(this.i.a(str2));
        }
        dvx dvxVar = ((dwf) cpnVar).a;
        dvxVar.getClass();
        ?? r1 = this.b;
        r1.f(str, ((ebx) this.f).t);
        r1.h(str, dvxVar);
    }

    public nhz(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, uem uemVar7, uem uemVar8, uem uemVar9, uem uemVar10, uem uemVar11) {
        uemVar.getClass();
        this.i = uemVar;
        uemVar2.getClass();
        this.f = uemVar2;
        uemVar3.getClass();
        this.e = uemVar3;
        uemVar4.getClass();
        this.d = uemVar4;
        uemVar5.getClass();
        this.k = uemVar5;
        uemVar6.getClass();
        this.j = uemVar6;
        uemVar7.getClass();
        this.h = uemVar7;
        uemVar8.getClass();
        this.c = uemVar8;
        uemVar9.getClass();
        this.g = uemVar9;
        uemVar10.getClass();
        this.a = uemVar10;
        uemVar11.getClass();
        this.b = uemVar11;
    }

    public nhz(hpa hpaVar, List list, obu obuVar, iso isoVar, hbj hbjVar, Executor executor, jsf jsfVar, lny lnyVar, jsv jsvVar, rwc rwcVar, rwc rwcVar2) {
        this.i = hpaVar;
        this.a = list;
        this.f = obuVar;
        this.c = isoVar;
        this.j = hbjVar;
        this.g = executor;
        this.b = jsfVar;
        this.h = lnyVar;
        this.e = jsvVar;
        this.d = (owf) ((rwg) rwcVar).a;
        this.k = rwcVar2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nhz(ComposeView composeView, nhy nhyVar, nhw nhwVar, mxm mxmVar) {
        this(composeView, nhyVar, nhwVar, mxmVar, null, ScriptIntrinsicBLAS.TRANSPOSE);
        composeView.getClass();
        mxmVar.getClass();
    }

    public /* synthetic */ nhz(ComposeView composeView, nhy nhyVar, nhw nhwVar, mxm mxmVar, nhw nhwVar2, int i) {
        mxmVar = (i & 8) != 0 ? mxm.PORTRAIT : mxmVar;
        nhwVar = (i & 4) != 0 ? null : nhwVar;
        nhwVar2 = (i & 16) != 0 ? null : nhwVar2;
        mxmVar.getClass();
        this.a = new gox(nhyVar.d, new niy(nhyVar), new uqd(this, 1, null));
        azw azwVar = new azw(composeView.getResources().getColor(R.color.slider_background_color, composeView.getContext().getTheme()));
        this.k = azwVar;
        bap bapVar = bap.c;
        this.b = new azz("", bapVar);
        this.c = new azz(nhyVar, bapVar);
        this.d = new azz(nhwVar, bapVar);
        this.e = new azz(nhwVar2, bapVar);
        this.f = new azz(true, bapVar);
        this.g = new LinkedHashSet();
        this.h = new azz(mxm.PORTRAIT, bapVar);
        this.i = new azz(mxmVar, bapVar);
        Object systemService = composeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.j = (AccessibilityManager) systemService;
        Object context = composeView.getContext();
        boolean z = (context instanceof fdi) && ((fdi) context).b().p(gzo.bw);
        if (z) {
            azwVar.h(composeView.getResources().getColor(R.color.camera_protection_background_on_viewfinder_freeway, composeView.getContext().getTheme()));
        }
        composeView.setScreenReaderFocusable(true);
        composeView.setOnHoverListener(new ked(this, 2));
        composeView.e(new bfh(-791594683, true, new nhv(z, this, 0)));
    }
}
