package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.media.CamcorderProfile;
import android.util.Range;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class got {
    public final Object a;
    public final Object b;
    public final Object c;

    public got() {
        throw null;
    }

    private final boolean A() {
        return coh.c("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new dus(this, 2));
    }

    static /* synthetic */ void c(dey deyVar, gos gosVar) {
        deyVar.e(1, gosVar.a);
        deyVar.e(2, gosVar.b);
        deyVar.e(3, gosVar.c);
        deyVar.e(4, gosVar.d);
        deyVar.e(5, gosVar.e);
    }

    static /* synthetic */ void d(dey deyVar, Object obj) {
        gpa gpaVar = (gpa) obj;
        deyVar.e(1, gpaVar.a.ordinal());
        deyVar.e(2, gpaVar.b);
        deyVar.e(3, gpaVar.c);
        deyVar.e(4, gpaVar.d);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, oxn] */
    private final List z(pjr pjrVar, oxh oxhVar) {
        LinkedList linkedList = new LinkedList();
        for (oxw oxwVar : oxw.values()) {
            oxj oxjVar = oxwVar.o;
            if (CamcorderProfile.hasProfile(Integer.parseInt(pjrVar.a), oxwVar.n)) {
                if (this.a.e(ojl.bT(pjrVar, oxwVar), oxhVar, oxjVar)) {
                    linkedList.addFirst(oxjVar);
                }
            }
        }
        return linkedList;
    }

    public final void a() {
        dei.a((dco) this.c, false, true, new aks(13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void b() {
        ?? r0 = this.a;
        if (r0.getBoolean("pref_key_reboot_completed", false)) {
            ((dco) this.c).o(new gpk(this, 1));
            r0.edit().putBoolean("pref_key_reboot_completed", false).apply();
        }
    }

    public final int e() {
        return ((AtomicInteger) this.c).get();
    }

    public final int f() {
        return ((AtomicInteger) this.b).get();
    }

    public final int g() {
        return ((AtomicInteger) this.a).incrementAndGet();
    }

    public final boolean h(nkw nkwVar) throws Resources.NotFoundException {
        boolean zBooleanValue = ((Boolean) ((luj) this.a).b(luf.aN)).booleanValue();
        if (zBooleanValue) {
            Context context = (Context) this.c;
            String string = context.getResources().getString(R.string.sapphire_turn_off_locked_folder_dialog_title);
            String string2 = nkwVar.equals(nkw.VIDEO_NIGHT_SIGHT) ? context.getResources().getString(R.string.night_sight_video_turn_off_locked_folder_dialog_body) : context.getResources().getString(R.string.video_boost_turn_off_locked_folder_dialog_body);
            rkc rkcVar = new rkc(context, R.style.Theme_Camera_MaterialAlertDialog);
            rkcVar.t(string);
            rkcVar.m(string2);
            rkcVar.r(context.getResources().getString(R.string.dialog_ok), new jdc(1));
            rkcVar.c();
        }
        return zBooleanValue;
    }

    public final WindowLayoutComponent i() {
        if (((cxb) this.c).m() && coh.c("WindowExtensions#getWindowLayoutComponent is not valid", new apa(this, 18)) && coh.c("FoldingFeature class is not valid", new apa(this, 19))) {
            int i = dug.a;
            int iA = dug.a();
            if (iA <= 0) {
                return null;
            }
            boolean zM = true;
            boolean z = true;
            if (iA == 1) {
                zM = A();
            } else if (iA < 5) {
                zM = m();
            } else {
                int i2 = 0;
                if (!m() || !coh.c("DisplayFoldFeature is not valid", new dus(this, z ? 1 : 0)) || !coh.c("SupportedWindowFeatures is not valid", new apa(this, 20)) || !coh.c("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new dus(this, i2))) {
                    zM = false;
                }
            }
            if (zM) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        return null;
    }

    public final Class j() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.b).loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final Class k() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.b).loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final Class l() {
        Class<?> clsLoadClass = ((ClassLoader) this.b).loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final boolean m() {
        if (!A()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return coh.c(sb.toString(), new dus(this, 3));
    }

    public final void n() {
        synchronized (this) {
            Object obj = this.c;
            ((AtomicInteger) obj).decrementAndGet();
            if (((AtomicInteger) obj).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean o() {
        synchronized (this) {
            if (((AtomicBoolean) this.b).get()) {
                return false;
            }
            ((AtomicInteger) this.c).incrementAndGet();
            return true;
        }
    }

    public final void p(Menu menu, MenuInflater menuInflater) {
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            ((ch) ((rnu) it.next()).a).U(menu, menuInflater);
        }
    }

    public final void q(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            ((ch) ((rnu) it.next()).a).W(menu);
        }
    }

    public final boolean r(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            if (((ch) ((rnu) it.next()).a).V(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void s(cjo cjoVar) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = cjoVar.aI.size();
        for (int i = 0; i < size; i++) {
            cjn cjnVar = (cjn) cjoVar.aI.get(i);
            if (cjnVar.M() == 3 || cjnVar.N() == 3) {
                arrayList.add(cjnVar);
            }
        }
        cjoVar.c();
    }

    public final boolean t(ckm ckmVar, cjn cjnVar, int i) {
        cjv cjvVar = (cjv) this.a;
        cjvVar.i = cjnVar.M();
        cjvVar.j = cjnVar.N();
        cjvVar.a = cjnVar.j();
        cjvVar.b = cjnVar.h();
        cjvVar.g = false;
        cjvVar.h = i;
        int i2 = cjvVar.i;
        int i3 = cjvVar.j;
        boolean z = i2 == 3 && cjnVar.X > 0.0f;
        boolean z2 = i3 == 3 && cjnVar.X > 0.0f;
        if (z && cjnVar.u[0] == 4) {
            cjvVar.i = 1;
        }
        if (z2 && cjnVar.u[1] == 4) {
            cjvVar.j = 1;
        }
        ckmVar.a(cjnVar, cjvVar);
        cjnVar.C(cjvVar.c);
        cjnVar.x(cjvVar.d);
        cjnVar.F = cjvVar.f;
        cjnVar.u(cjvVar.e);
        cjvVar.h = 0;
        return cjvVar.g;
    }

    public final void u(cjo cjoVar, int i, int i2, int i3) {
        int i4 = cjoVar.ac;
        int i5 = cjoVar.ad;
        cjoVar.B(0);
        cjoVar.A(0);
        cjoVar.C(i2);
        cjoVar.x(i3);
        cjoVar.B(i4);
        cjoVar.A(i5);
        Object obj = this.c;
        ((cjo) obj).b = i;
        ((cju) obj).T();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uif] */
    public final Object v(Object obj) {
        if (obj == null) {
            return null;
        }
        aoh aohVar = (aoh) ((zu) this.a).a(obj);
        if (aohVar != null) {
            return aohVar.b;
        }
        amt amtVar = (amt) this.c.a();
        int iA = amtVar.a(obj);
        if (iA == -1) {
            return null;
        }
        return amtVar.c(iA);
    }

    public final uiu w(int i, Object obj, Object obj2) {
        zu zuVar = (zu) this.a;
        aoh aohVar = (aoh) zuVar.a(obj);
        if (aohVar != null && aohVar.c == i && a.ao(aohVar.b, obj2)) {
            return aohVar.a();
        }
        aoh aohVar2 = new aoh(this, i, obj, obj2);
        zuVar.j(obj, aohVar2);
        return aohVar2.a();
    }

    public final Object x(afs afsVar, uiu uiuVar, uhb uhbVar) throws Throwable {
        Object objI = ung.i(new itq(this, afsVar, uiuVar, (uhb) null, 1), uhbVar);
        return objI == uhi.a ? objI : ufg.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, oxn] */
    public final iso y(pjr pjrVar) {
        ?? r0 = this.c;
        if (r0.containsKey(pjrVar)) {
            return (iso) r0.get(pjrVar);
        }
        kgw kgwVarF = ((pkc) this.b).f(pjrVar);
        HashMap map = new HashMap();
        oxh oxhVar = oxh.FPS_30;
        map.put(oxhVar, z(pjrVar, oxhVar));
        oxh oxhVar2 = oxh.FPS_60;
        map.put(oxhVar2, z(pjrVar, oxhVar2));
        oxh oxhVar3 = oxh.FPS_AUTO;
        map.put(oxhVar3, z(pjrVar, oxhVar3));
        oxh oxhVar4 = oxh.FPS_24;
        map.put(oxhVar4, z(pjrVar, oxhVar4));
        oxh oxhVar5 = oxh.FPS_60C_30E;
        map.put(oxhVar5, z(pjrVar, oxhVar5));
        oxh oxhVar6 = oxh.FPS_60C_24E;
        map.put(oxhVar6, z(pjrVar, oxhVar6));
        HashMap map2 = new HashMap();
        Iterator it = oxh.e().iterator();
        while (it.hasNext()) {
            map2.put((oxh) it.next(), new ArrayList());
        }
        if (kgwVarF.L()) {
            ArrayList<oxj> arrayList = new ArrayList();
            Iterator it2 = kgwVarF.x().iterator();
            while (it2.hasNext()) {
                oxj oxjVarB = oxj.b((pas) it2.next());
                if (oxjVarB != null) {
                    arrayList.add(oxjVarB);
                }
            }
            for (oxj oxjVar : arrayList) {
                oxv oxvVarA = oxv.a(oxjVar);
                if (oxvVarA != null && ojl.bR(pjrVar, oxvVarA)) {
                    List listW = kgwVarF.w(oxjVar.c());
                    for (oxh oxhVar7 : oxh.e()) {
                        if (ojl.bR(pjrVar, oxvVarA)) {
                            if (this.a.e(ojl.bS(pjrVar, oxvVarA), oxhVar7, oxjVar)) {
                                Iterator it3 = listW.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (oxhVar7.k == ((Integer) ((Range) it3.next()).getUpper()).intValue()) {
                                            List list = (List) map2.get(oxhVar7);
                                            list.getClass();
                                            list.add(oxjVar);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            oxv[] oxvVarArrValues = oxv.values();
            int length = oxvVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    map2.put(oxh.FPS_240_HFR_8X, new ArrayList());
                    break;
                }
                oxv oxvVar = oxvVarArrValues[i];
                if (ojl.bR(pjrVar, oxvVar) && ojl.bS(pjrVar, oxvVar).l == 240) {
                    break;
                }
                i++;
            }
        }
        map.putAll(map2);
        Iterator it4 = map.keySet().iterator();
        while (it4.hasNext()) {
            List list2 = (List) map.get((oxh) it4.next());
            oxj oxjVar2 = oxj.RES_UNKNOWN;
            Collections.sort(list2, new bur(5));
        }
        iso isoVar = new iso(kgwVarF, (Map) map);
        r0.put(pjrVar, isoVar);
        return isoVar;
    }

    public got(dco dcoVar) {
        this.c = dcoVar;
        this.a = new gou();
        this.b = new gov();
    }

    public got(got gotVar, iso isoVar, geh gehVar) {
        this.a = gotVar;
        this.b = isoVar;
        this.c = gehVar;
    }

    public got(ClassLoader classLoader, duf dufVar) {
        this.b = classLoader;
        this.a = dufVar;
        this.c = new cxb(classLoader, (byte[]) null);
    }

    public got(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public got(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public got(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public got(oxn oxnVar, pkc pkcVar) {
        this.c = new HashMap();
        this.a = oxnVar;
        this.b = pkcVar;
    }

    public got(uiq uiqVar) {
        this.c = uiqVar;
        this.b = new rnu(this);
        this.a = new byz(null, null, null, null);
    }

    public got(bfs bfsVar, uif uifVar) {
        this.b = bfsVar;
        this.c = uifVar;
        long[] jArr = zv.a;
        this.a = new zu((byte[]) null);
    }

    public got(byte[] bArr) {
        this.c = new AtomicInteger(0);
        this.b = new AtomicInteger(0);
        this.a = new AtomicInteger(0);
    }

    public got(char[] cArr) {
        this.a = new WeakHashMap();
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
    }

    public got(cjo cjoVar) {
        this.b = new ArrayList();
        this.a = new cjv();
        this.c = cjoVar;
    }

    public got(Runnable runnable) {
        this.a = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.b = runnable;
    }

    public got(uif uifVar) {
        this.a = uifVar;
        this.c = new AtomicInteger(0);
        this.b = new AtomicBoolean(false);
    }
}
