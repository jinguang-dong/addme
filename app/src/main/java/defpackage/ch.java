package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.ar.core.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ch {
    private boolean A;
    private ArrayList B;
    private final cnh E;
    private final cnh F;
    private final cnh G;
    private final cnh H;
    private final bt I;
    private boolean J;
    private ArrayList K;
    private ArrayList L;
    private ArrayList M;
    private final Runnable N;
    private final rnu O;
    private final byi P;
    public nu e;
    final ArrayList j;
    public final CopyOnWriteArrayList k;
    int l;
    public bu m;
    public br n;
    public bm o;
    bm p;
    public oc q;
    public oc r;
    public oc s;
    ArrayDeque t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ck y;
    public final byz z;
    public final ArrayList a = new ArrayList();
    public final co b = new co();
    ArrayList c = new ArrayList();
    public final bv d = new bv(this);
    ai f = null;
    boolean g = false;
    public final no h = new bx(this);
    public final AtomicInteger i = new AtomicInteger();
    private final Map C = DesugarCollections.synchronizedMap(new HashMap());
    private final Map D = DesugarCollections.synchronizedMap(new HashMap());

    public ch() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.j = new ArrayList();
        this.z = new byz(this);
        this.k = new CopyOnWriteArrayList();
        this.E = new bn(this, 2);
        this.F = new bn(this, 3);
        this.G = new bn(this, 4);
        this.H = new bn(this, 5);
        this.O = new rnu(this);
        this.l = -1;
        this.I = new by(this);
        this.P = new byi();
        this.t = new ArrayDeque();
        this.N = new ea(this, 1);
    }

    public static boolean X(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    static final Set ac(ai aiVar) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = aiVar.d;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            bm bmVar = ((cp) arrayList.get(i)).b;
            if (bmVar != null && aiVar.j) {
                hashSet.add(bmVar);
            }
            i++;
        }
    }

    public static final boolean ad(bm bmVar) {
        if (bmVar.L && bmVar.M) {
            return true;
        }
        boolean zAd = false;
        for (bm bmVar2 : bmVar.C.b.f()) {
            if (bmVar2 != null) {
                zAd = ad(bmVar2);
            }
            if (zAd) {
                return true;
            }
        }
        return false;
    }

    static final boolean ae(bm bmVar) {
        if (bmVar == null) {
            return true;
        }
        if (bmVar.M) {
            return bmVar.A == null || ae(bmVar.D);
        }
        return false;
    }

    static final void ag(bm bmVar) {
        if (X(2)) {
            Objects.toString(bmVar);
        }
        if (bmVar.H) {
            bmVar.H = false;
            bmVar.V = !bmVar.V;
        }
    }

    private final ViewGroup aj(bm bmVar) {
        ViewGroup viewGroup = bmVar.O;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (bmVar.F <= 0 || !this.n.b()) {
            return null;
        }
        View viewA = this.n.a(bmVar.F);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    private final Set ak() {
        HashSet hashSet = new HashSet();
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((cn) it.next()).a.O;
            if (viewGroup != null) {
                hashSet.add(e.y(viewGroup, ai()));
            }
        }
        return hashSet;
    }

    private final void al() {
        if (aa()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void am() {
        this.A = false;
        this.L.clear();
        this.K.clear();
    }

    private final void an() {
        if (this.J) {
            this.J = false;
            as();
        }
    }

    private final void ao(boolean z) {
        if (this.A) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.m == null) {
            if (!this.x) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.m.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            al();
        }
        if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0222 A[PHI: r14
      0x0222: PHI (r14v16 int) = (r14v15 int), (r14v17 int) binds: [B:99:0x0212, B:104:0x021e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ap(java.util.ArrayList r25, java.util.ArrayList r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch.ap(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void aq(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((ai) arrayList.get(i)).s) {
                if (i2 != i) {
                    ap(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((ai) arrayList.get(i2)).s) {
                        i2++;
                    }
                }
                ap(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            ap(arrayList, arrayList2, i2, size);
        }
    }

    private final void ar(bm bmVar) {
        ViewGroup viewGroupAj = aj(bmVar);
        if (viewGroupAj == null || bmVar.g() + bmVar.h() + bmVar.i() + bmVar.j() <= 0) {
            return;
        }
        if (viewGroupAj.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupAj.setTag(R.id.visible_removing_fragment_view_tag, bmVar);
        }
        ((bm) viewGroupAj.getTag(R.id.visible_removing_fragment_view_tag)).v(bmVar.x());
    }

    private final void as() {
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            M((cn) it.next());
        }
    }

    private final void at(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new db());
        bu buVar = this.m;
        if (buVar == null) {
            try {
                E("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            ((bo) buVar).a.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public static bm f(View view) {
        while (view != null) {
            bm bmVarG = g(view);
            if (bmVarG != null) {
                return bmVarG;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    static bm g(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof bm) {
            return (bm) tag;
        }
        return null;
    }

    final void A() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        C(7);
    }

    final void B() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        C(5);
    }

    public final void C(int i) {
        try {
            this.A = true;
            for (cn cnVar : this.b.b.values()) {
                if (cnVar != null) {
                    cnVar.b = i;
                }
            }
            K(i, false);
            Iterator it = ak().iterator();
            while (it.hasNext()) {
                ((dh) it.next()).g();
            }
            this.A = false;
            ah(true);
        } catch (Throwable th) {
            this.A = false;
            throw th;
        }
    }

    final void D() {
        this.w = true;
        this.y.g = true;
        C(4);
    }

    public final void E(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        co coVar = this.b;
        HashMap map = coVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (cn cnVar : map.values()) {
                printWriter.print(str);
                if (cnVar != null) {
                    String strValueOf = String.valueOf(str);
                    bm bmVar = cnVar.a;
                    printWriter.println(bmVar);
                    bmVar.dump(strValueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = coVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                bm bmVar2 = (bm) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(bmVar2.toString());
            }
        }
        ArrayList arrayList2 = this.B;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                bm bmVar3 = (bm) this.B.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(bmVar3.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String strValueOf2 = String.valueOf(str);
                ai aiVar = (ai) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aiVar.toString());
                aiVar.e(strValueOf2.concat("    "), printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        ArrayList arrayList3 = this.a;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (ce) arrayList3.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.n);
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    public final void F() {
        Iterator it = ak().iterator();
        while (it.hasNext()) {
            ((dh) it.next()).g();
        }
    }

    final void G(ce ceVar, boolean z) {
        if (!z) {
            if (this.m == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            al();
        }
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (this.m == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(ceVar);
            synchronized (arrayList) {
                if (arrayList.size() == 1) {
                    this.m.d.removeCallbacks(this.N);
                    this.m.d.post(this.N);
                    S();
                }
            }
        }
    }

    final void H(ce ceVar, boolean z) {
        if (z && (this.m == null || this.x)) {
            return;
        }
        ao(z);
        ai aiVar = this.f;
        if (aiVar != null) {
            aiVar.b = false;
            aiVar.b();
            if (X(3)) {
                Objects.toString(this.f);
                Objects.toString(ceVar);
            }
            this.f.j(false, false);
            this.f.g(this.K, this.L);
            ArrayList arrayList = this.f.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bm bmVar = ((cp) arrayList.get(i)).b;
                if (bmVar != null) {
                    bmVar.s = false;
                }
            }
            this.f = null;
        }
        ceVar.g(this.K, this.L);
        this.A = true;
        try {
            aq(this.K, this.L);
            am();
            S();
            an();
            this.b.i();
        } catch (Throwable th) {
            am();
            throw th;
        }
    }

    public final void I() {
        for (dh dhVar : ak()) {
            if (dhVar.e) {
                dhVar.e = false;
                dhVar.f();
            }
        }
    }

    final void J(bm bmVar) {
        if (X(2)) {
            Objects.toString(bmVar);
        }
        if (bmVar.H) {
            return;
        }
        bmVar.H = true;
        bmVar.V = true ^ bmVar.V;
        ar(bmVar);
    }

    final void K(int i, boolean z) {
        bu buVar;
        if (this.m == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.l) {
            this.l = i;
            co coVar = this.b;
            ArrayList arrayList = coVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cn cnVar = (cn) coVar.b.get(((bm) arrayList.get(i2)).k);
                if (cnVar != null) {
                    cnVar.d();
                }
            }
            for (cn cnVar2 : coVar.b.values()) {
                if (cnVar2 != null) {
                    cnVar2.d();
                    bm bmVar = cnVar2.a;
                    if (bmVar.r && !bmVar.y()) {
                        boolean z2 = bmVar.t;
                        coVar.k(cnVar2);
                    }
                }
            }
            as();
            if (this.u && (buVar = this.m) != null && this.l == 7) {
                buVar.e();
                this.u = false;
            }
        }
    }

    public final void L() {
        if (this.m == null) {
            return;
        }
        this.v = false;
        this.w = false;
        this.y.g = false;
        for (bm bmVar : this.b.g()) {
            if (bmVar != null) {
                bmVar.C.L();
            }
        }
    }

    final void M(cn cnVar) {
        bm bmVar = cnVar.a;
        if (bmVar.Q) {
            if (this.A) {
                this.J = true;
            } else {
                bmVar.Q = false;
                cnVar.d();
            }
        }
    }

    final void N(bm bmVar) {
        if (X(2)) {
            Objects.toString(bmVar);
            int i = bmVar.z;
        }
        boolean zY = bmVar.y();
        if (bmVar.I && zY) {
            return;
        }
        this.b.l(bmVar);
        if (ad(bmVar)) {
            this.u = true;
        }
        bmVar.r = true;
        ar(bmVar);
    }

    final void O(Parcelable parcelable) {
        cn cnVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.m.c.getClassLoader());
                this.D.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.m.c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        co coVar = this.b;
        HashMap map2 = coVar.c;
        map2.clear();
        map2.putAll(map);
        ci ciVar = (ci) bundle3.getParcelable("state");
        if (ciVar == null) {
            return;
        }
        coVar.b.clear();
        ArrayList arrayList = ciVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundleA = coVar.a((String) arrayList.get(i), null);
            if (bundleA != null) {
                bm bmVar = (bm) this.y.b.get(((cm) bundleA.getParcelable("state")).b);
                if (bmVar != null) {
                    if (X(2)) {
                        Objects.toString(bmVar);
                    }
                    cnVar = new cn(this.z, coVar, bmVar, bundleA);
                } else {
                    cnVar = new cn(this.z, coVar, this.m.c.getClassLoader(), h(), bundleA);
                }
                bm bmVar2 = cnVar.a;
                bmVar2.g = bundleA;
                bmVar2.A = this;
                if (X(2)) {
                    String str3 = bmVar2.k;
                    Objects.toString(bmVar2);
                }
                cnVar.e(this.m.c.getClassLoader());
                coVar.j(cnVar);
                cnVar.b = this.l;
            }
        }
        for (bm bmVar3 : new ArrayList(this.y.b.values())) {
            if (!coVar.m(bmVar3.k)) {
                if (X(2)) {
                    Objects.toString(bmVar3);
                    Objects.toString(ciVar.a);
                }
                this.y.e(bmVar3);
                bmVar3.A = this;
                cn cnVar2 = new cn(this.z, coVar, bmVar3);
                cnVar2.b = 1;
                cnVar2.d();
                bmVar3.r = true;
                cnVar2.d();
            }
        }
        ArrayList<String> arrayList2 = ciVar.b;
        coVar.a.clear();
        if (arrayList2 != null) {
            for (String str4 : arrayList2) {
                bm bmVarB = coVar.b(str4);
                if (bmVarB == null) {
                    throw new IllegalStateException(a.bw(str4, "No instantiated fragment for (", ")"));
                }
                if (X(2)) {
                    Objects.toString(bmVarB);
                }
                coVar.h(bmVarB);
            }
        }
        aj[] ajVarArr = ciVar.c;
        if (ajVarArr != null) {
            this.c = new ArrayList(ajVarArr.length);
            int i2 = 0;
            while (true) {
                aj[] ajVarArr2 = ciVar.c;
                if (i2 >= ajVarArr2.length) {
                    break;
                }
                aj ajVar = ajVarArr2[i2];
                ai aiVar = new ai(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = ajVar.a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    cp cpVar = new cp();
                    int i5 = i3 + 1;
                    cpVar.a = iArr[i3];
                    if (X(2)) {
                        aiVar.toString();
                        int i6 = iArr[i5];
                    }
                    cpVar.h = cwb.values()[ajVar.c[i4]];
                    cpVar.i = cwb.values()[ajVar.d[i4]];
                    int i7 = i3 + 2;
                    cpVar.c = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    cpVar.d = i8;
                    int i9 = iArr[i3 + 3];
                    cpVar.e = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    cpVar.f = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    cpVar.g = i12;
                    aiVar.e = i8;
                    aiVar.f = i9;
                    aiVar.g = i11;
                    aiVar.h = i12;
                    aiVar.l(cpVar);
                    i4++;
                }
                aiVar.i = ajVar.e;
                aiVar.l = ajVar.f;
                aiVar.j = true;
                aiVar.m = ajVar.h;
                aiVar.n = ajVar.i;
                aiVar.o = ajVar.j;
                aiVar.p = ajVar.k;
                aiVar.q = ajVar.l;
                aiVar.r = ajVar.m;
                aiVar.s = ajVar.n;
                aiVar.c = ajVar.g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = ajVar.b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str5 = (String) arrayList3.get(i13);
                    if (str5 != null) {
                        ((cp) aiVar.d.get(i13)).b = c(str5);
                    }
                    i13++;
                }
                aiVar.a(1);
                if (X(2)) {
                    int i14 = aiVar.c;
                    aiVar.toString();
                    PrintWriter printWriter = new PrintWriter(new db());
                    aiVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.c.add(aiVar);
                i2++;
            }
        } else {
            this.c = new ArrayList();
        }
        this.i.set(ciVar.d);
        String str6 = ciVar.e;
        if (str6 != null) {
            bm bmVarC = c(str6);
            this.p = bmVarC;
            x(bmVarC);
        }
        ArrayList arrayList4 = ciVar.f;
        if (arrayList4 != null) {
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                this.C.put((String) arrayList4.get(i15), (al) ciVar.g.get(i15));
            }
        }
        this.t = new ArrayDeque(ciVar.h);
    }

    final void P(bm bmVar, boolean z) {
        ViewGroup viewGroupAj = aj(bmVar);
        if (viewGroupAj == null || !(viewGroupAj instanceof bs)) {
            return;
        }
        ((bs) viewGroupAj).a = !z;
    }

    final void Q(bm bmVar, cwb cwbVar) {
        if (!bmVar.equals(c(bmVar.k)) || (bmVar.B != null && bmVar.A != this)) {
            throw new IllegalArgumentException(a.bC(this, bmVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        bmVar.Y = cwbVar;
    }

    public final void S() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.h.g(true);
                if (X(3)) {
                    toString();
                }
            } else {
                boolean z = a() > 0 && Z(this.o);
                if (X(3)) {
                    toString();
                }
                this.h.g(z);
            }
        }
    }

    final boolean T(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (bm bmVar : this.b.g()) {
            if (bmVar != null && !bmVar.H && bmVar.C.T(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean U(Menu menu, MenuInflater menuInflater) {
        if (this.l <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (bm bmVar : this.b.g()) {
            if (bmVar != null && ae(bmVar) && !bmVar.H) {
                if ((bmVar.L && bmVar.M) | bmVar.C.U(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bmVar);
                    z = true;
                }
            }
        }
        if (this.B != null) {
            for (int i = 0; i < this.B.size(); i++) {
                bm bmVar2 = (bm) this.B.get(i);
                if (arrayList != null) {
                    arrayList.contains(bmVar2);
                }
            }
        }
        this.B = arrayList;
        return z;
    }

    public final boolean V(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (bm bmVar : this.b.g()) {
            if (bmVar != null && !bmVar.H && bmVar.C.V(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean W(Menu menu) {
        if (this.l <= 0) {
            return false;
        }
        boolean z = false;
        for (bm bmVar : this.b.g()) {
            if (bmVar != null && ae(bmVar) && !bmVar.H) {
                if (bmVar.C.W(menu) | (bmVar.L && bmVar.M)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean Y() {
        bm bmVar = this.o;
        if (bmVar == null) {
            return true;
        }
        return bmVar.isAdded() && bmVar.getParentFragmentManager().Y();
    }

    final boolean Z(bm bmVar) {
        if (bmVar == null) {
            return true;
        }
        ch chVar = bmVar.A;
        return bmVar.equals(chVar.p) && Z(chVar.o);
    }

    public final int a() {
        return this.c.size() + (this.f != null ? 1 : 0);
    }

    public final boolean aa() {
        return this.v || this.w;
    }

    public final boolean ab() {
        ah(false);
        ao(true);
        bm bmVar = this.p;
        if (bmVar != null && bmVar.getChildFragmentManager().ab()) {
            return true;
        }
        boolean zAf = af(this.K, this.L, -1, 0);
        if (zAf) {
            this.A = true;
            try {
                aq(this.K, this.L);
            } finally {
                am();
            }
        }
        S();
        an();
        this.b.i();
        return zAf;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean af(java.util.ArrayList r5, java.util.ArrayList r6, int r7, int r8) {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.c
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = -1
            if (r0 == 0) goto Lc
        La:
            r7 = r2
            goto L58
        Lc:
            if (r7 >= 0) goto L1a
            if (r8 == 0) goto L12
            r7 = r1
            goto L58
        L12:
            java.util.ArrayList r7 = r4.c
            int r7 = r7.size()
            int r7 = r7 + r2
            goto L58
        L1a:
            java.util.ArrayList r0 = r4.c
            int r0 = r0.size()
            int r0 = r0 + r2
        L21:
            if (r0 < 0) goto L33
            java.util.ArrayList r3 = r4.c
            java.lang.Object r3 = r3.get(r0)
            ai r3 = (defpackage.ai) r3
            int r3 = r3.c
            if (r7 != r3) goto L30
            goto L33
        L30:
            int r0 = r0 + (-1)
            goto L21
        L33:
            if (r0 >= 0) goto L37
        L35:
            r7 = r0
            goto L58
        L37:
            if (r8 != 0) goto L46
            java.util.ArrayList r7 = r4.c
            int r7 = r7.size()
            int r7 = r7 + r2
            if (r0 != r7) goto L43
            goto La
        L43:
            int r7 = r0 + 1
            goto L58
        L46:
            if (r0 <= 0) goto L35
            java.util.ArrayList r8 = r4.c
            int r3 = r0 + (-1)
            java.lang.Object r8 = r8.get(r3)
            ai r8 = (defpackage.ai) r8
            int r8 = r8.c
            if (r7 != r8) goto L35
            r0 = r3
            goto L46
        L58:
            if (r7 >= 0) goto L5b
            return r1
        L5b:
            java.util.ArrayList r8 = r4.c
            int r8 = r8.size()
            int r8 = r8 + r2
        L62:
            r0 = 1
            if (r8 < r7) goto L7a
            java.util.ArrayList r1 = r4.c
            java.lang.Object r1 = r1.remove(r8)
            ai r1 = (defpackage.ai) r1
            r5.add(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.add(r0)
            int r8 = r8 + (-1)
            goto L62
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch.af(java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    public final void ah(boolean z) {
        ai aiVar;
        ao(z);
        if (!this.g && (aiVar = this.f) != null) {
            aiVar.b = false;
            aiVar.b();
            if (X(3)) {
                Objects.toString(this.f);
                Objects.toString(this.a);
            }
            this.f.j(false, false);
            this.a.add(0, this.f);
            ArrayList arrayList = this.f.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bm bmVar = ((cp) arrayList.get(i)).b;
                if (bmVar != null) {
                    bmVar.s = false;
                }
            }
            this.f = null;
        }
        while (true) {
            ArrayList arrayList2 = this.K;
            ArrayList arrayList3 = this.L;
            ArrayList arrayList4 = this.a;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean zG = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        zG |= ((ce) arrayList4.get(i2)).g(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.m.d.removeCallbacks(this.N);
                    if (!zG) {
                        break;
                    }
                    this.A = true;
                    try {
                        aq(this.K, this.L);
                    } finally {
                        am();
                    }
                } catch (Throwable th) {
                    this.a.clear();
                    this.m.d.removeCallbacks(this.N);
                    throw th;
                }
            }
        }
        S();
        an();
        this.b.i();
    }

    final byi ai() {
        bm bmVar = this.o;
        return bmVar != null ? bmVar.A.ai() : this.P;
    }

    final Bundle b() {
        int i;
        aj[] ajVarArr;
        ArrayList arrayList;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        I();
        F();
        ah(true);
        this.v = true;
        this.y.g = true;
        co coVar = this.b;
        HashMap map = coVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            cn cnVar = (cn) it.next();
            if (cnVar != null) {
                bm bmVar = cnVar.a;
                String str = bmVar.k;
                Bundle bundle3 = new Bundle();
                if (bmVar.f == -1 && (bundle = bmVar.g) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new cm(bmVar));
                if (bmVar.f >= 0) {
                    Bundle bundle4 = new Bundle();
                    bmVar.onSaveInstanceState(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    cnVar.c.Q(bmVar, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    bmVar.af.Y(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleB = bmVar.C.b();
                    if (!bundleB.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleB);
                    }
                    if (bmVar.P != null) {
                        cnVar.f();
                    }
                    SparseArray<? extends Parcelable> sparseArray = bmVar.h;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = bmVar.i;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = bmVar.l;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                coVar.a(str, bundle3);
                arrayList2.add(bmVar.k);
                if (X(2)) {
                    Objects.toString(bmVar);
                    Objects.toString(bmVar.g);
                }
            }
        }
        HashMap map2 = coVar.c;
        if (!map2.isEmpty()) {
            ArrayList arrayList3 = coVar.a;
            synchronized (arrayList3) {
                ajVarArr = null;
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        bm bmVar2 = (bm) it2.next();
                        arrayList.add(bmVar2.k);
                        if (X(2)) {
                            String str2 = bmVar2.k;
                            Objects.toString(bmVar2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                ajVarArr = new aj[size];
                for (i = 0; i < size; i++) {
                    ajVarArr[i] = new aj((ai) this.c.get(i));
                    if (X(2)) {
                        Objects.toString(this.c.get(i));
                    }
                }
            }
            ci ciVar = new ci();
            ciVar.a = arrayList2;
            ciVar.b = arrayList;
            ciVar.c = ajVarArr;
            ciVar.d = this.i.get();
            bm bmVar3 = this.p;
            if (bmVar3 != null) {
                ciVar.e = bmVar3.k;
            }
            ArrayList arrayList4 = ciVar.f;
            Map map3 = this.C;
            arrayList4.addAll(map3.keySet());
            ciVar.g.addAll(map3.values());
            ciVar.h = new ArrayList(this.t);
            bundle2.putParcelable("state", ciVar);
            Map map4 = this.D;
            for (String str3 : map4.keySet()) {
                bundle2.putBundle("result_".concat(String.valueOf(str3)), (Bundle) map4.get(str3));
            }
            for (String str4 : map2.keySet()) {
                bundle2.putBundle("fragment_".concat(String.valueOf(str4)), (Bundle) map2.get(str4));
            }
        }
        return bundle2;
    }

    final bm c(String str) {
        return this.b.b(str);
    }

    public final bm d(int i) {
        co coVar = this.b;
        ArrayList arrayList = coVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (cn cnVar : coVar.b.values()) {
                    if (cnVar != null) {
                        bm bmVar = cnVar.a;
                        if (bmVar.E == i) {
                            return bmVar;
                        }
                    }
                }
                return null;
            }
            bm bmVar2 = (bm) arrayList.get(size);
            if (bmVar2 != null && bmVar2.E == i) {
                return bmVar2;
            }
        }
    }

    public final bm e(String str) {
        co coVar = this.b;
        ArrayList arrayList = coVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (cn cnVar : coVar.b.values()) {
                    if (cnVar != null) {
                        bm bmVar = cnVar.a;
                        if (str.equals(bmVar.G)) {
                            return bmVar;
                        }
                    }
                }
                return null;
            }
            bm bmVar2 = (bm) arrayList.get(size);
            if (bmVar2 != null && str.equals(bmVar2.G)) {
                return bmVar2;
            }
        }
    }

    public final bt h() {
        bm bmVar = this.o;
        return bmVar != null ? bmVar.A.h() : this.I;
    }

    final cn i(bm bmVar) {
        String str = bmVar.mPreviousWho;
        if (str != null) {
            cui.a(bmVar, str);
        }
        if (X(2)) {
            Objects.toString(bmVar);
        }
        cn cnVarJ = j(bmVar);
        bmVar.A = this;
        co coVar = this.b;
        coVar.j(cnVarJ);
        if (!bmVar.I) {
            coVar.h(bmVar);
            bmVar.r = false;
            if (bmVar.P == null) {
                bmVar.V = false;
            }
            if (ad(bmVar)) {
                this.u = true;
            }
        }
        return cnVarJ;
    }

    final cn j(bm bmVar) {
        co coVar = this.b;
        cn cnVarD = coVar.d(bmVar.k);
        if (cnVarD != null) {
            return cnVarD;
        }
        cn cnVar = new cn(this.z, coVar, bmVar);
        cnVar.e(this.m.c.getClassLoader());
        cnVar.b = this.l;
        return cnVar;
    }

    final Set k(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((ai) arrayList.get(i)).d;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                bm bmVar = ((cp) arrayList2.get(i3)).b;
                if (bmVar != null && (viewGroup = bmVar.O) != null) {
                    hashSet.add(dh.c(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void l(cl clVar) {
        this.k.add(clVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v10, types: [bu, clw] */
    /* JADX WARN: Type inference failed for: r6v8, types: [bu, deu] */
    /* JADX WARN: Type inference failed for: r6v9, types: [bu, oh] */
    public final void m(bu buVar, br brVar, bm bmVar) {
        if (this.m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.m = buVar;
        this.n = brVar;
        this.o = bmVar;
        if (bmVar != null) {
            l(new bz());
        } else if (buVar instanceof cl) {
            l(buVar);
        }
        if (this.o != null) {
            S();
        }
        if (buVar instanceof nv) {
            nu nuVarJ = ((bo) buVar).a.j();
            this.e = nuVarJ;
            bm bmVar2 = bmVar != null ? bmVar : buVar;
            no noVar = this.h;
            bmVar2.getClass();
            noVar.getClass();
            cwc lifecycle = bmVar2.getLifecycle();
            if (lifecycle.a != cwb.a) {
                noVar.e(new nr(nuVarJ, lifecycle, noVar));
                nuVarJ.f();
                noVar.d = new nt(nuVarJ, 1);
            }
        }
        int i = 0;
        if (bmVar != null) {
            ck ckVar = bmVar.A.y;
            HashMap map = ckVar.c;
            ck ckVar2 = (ck) map.get(bmVar.k);
            if (ckVar2 == null) {
                ckVar2 = new ck(ckVar.e);
                map.put(bmVar.k, ckVar2);
            }
            this.y = ckVar2;
        } else {
            if (buVar instanceof cxt) {
                cxb viewModelStore$ar$class_merging = buVar.getViewModelStore$ar$class_merging();
                cxp cxpVar = ck.a;
                cxw cxwVar = cxw.a;
                cxwVar.getClass();
                this.y = (ck) cxs.a(ck.class, new gno(viewModelStore$ar$class_merging, cxpVar, cxwVar));
            } else {
                this.y = new ck(false);
            }
            bmVar = null;
        }
        ck ckVar3 = this.y;
        ckVar3.g = aa();
        this.b.d = ckVar3;
        ?? r6 = this.m;
        if ((r6 instanceof deu) && bmVar == null) {
            det savedStateRegistry = r6.getSavedStateRegistry();
            savedStateRegistry.b("android:support:fragments", new bw(this, i));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                O(bundleA);
            }
        }
        ?? r62 = this.m;
        if (r62 instanceof oh) {
            og ogVarEq = r62.eq();
            String strConcat = bmVar != null ? String.valueOf(bmVar.k).concat(":") : "";
            om omVar = new om();
            ca caVar = new ca(this, 0);
            String strConcat2 = "FragmentManager:".concat(strConcat);
            this.q = ogVarEq.a(strConcat2.concat("StartActivityForResult"), omVar, caVar);
            this.r = ogVarEq.a(strConcat2.concat("StartIntentSenderForResult"), new cb(), new ca(this, 2));
            this.s = ogVarEq.a(strConcat2.concat("RequestPermissions"), new ol(), new ca(this, 1));
        }
        ?? r63 = this.m;
        if (r63 instanceof clw) {
            r63.er(this.E);
        }
        bu buVar2 = this.m;
        if (buVar2 instanceof clx) {
            cnh cnhVar = this.F;
            bp bpVar = ((bo) buVar2).a;
            cnhVar.getClass();
            bpVar.i.add(cnhVar);
        }
        bu buVar3 = this.m;
        if (buVar3 instanceof dc) {
            cnh cnhVar2 = this.G;
            bp bpVar2 = ((bo) buVar3).a;
            cnhVar2.getClass();
            bpVar2.k.add(cnhVar2);
        }
        bu buVar4 = this.m;
        if (buVar4 instanceof dd) {
            cnh cnhVar3 = this.H;
            bp bpVar3 = ((bo) buVar4).a;
            cnhVar3.getClass();
            bpVar3.l.add(cnhVar3);
        }
        bu buVar5 = this.m;
        if ((buVar5 instanceof cns) && bmVar == null) {
            rnu rnuVar = this.O;
            bp bpVar4 = ((bo) buVar5).a;
            rnuVar.getClass();
            got gotVar = bpVar4.n;
            ((CopyOnWriteArrayList) gotVar.a).add(rnuVar);
            gotVar.b.run();
        }
    }

    final void n(bm bmVar) {
        if (X(2)) {
            Objects.toString(bmVar);
        }
        if (bmVar.I) {
            bmVar.I = false;
            if (bmVar.q) {
                return;
            }
            this.b.h(bmVar);
            if (X(2)) {
                Objects.toString(bmVar);
            }
            if (ad(bmVar)) {
                this.u = true;
            }
        }
    }

    final void o(bm bmVar) {
        if (X(2)) {
            Objects.toString(bmVar);
        }
        if (bmVar.I) {
            return;
        }
        bmVar.I = true;
        if (bmVar.q) {
            if (X(2)) {
                Objects.toString(bmVar);
            }
            this.b.l(bmVar);
            if (ad(bmVar)) {
                this.u = true;
            }
            ar(bmVar);
        }
    }

    final void p() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        C(4);
    }

    final void q(Configuration configuration, boolean z) {
        if (z && (this.m instanceof clw)) {
            at(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (bm bmVar : this.b.g()) {
            if (bmVar != null) {
                bmVar.onConfigurationChanged(configuration);
                if (z) {
                    bmVar.C.q(configuration, true);
                }
            }
        }
    }

    final void r() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        C(1);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bu, clw] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    final void s() {
        this.x = true;
        ah(true);
        F();
        bu buVar = this.m;
        if (buVar instanceof cxt ? this.b.d.f : true ^ ((Activity) buVar.c).isChangingConfigurations()) {
            Iterator it = this.C.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((al) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.b.d.c((String) it2.next(), false);
                }
            }
        }
        C(-1);
        bu buVar2 = this.m;
        if (buVar2 instanceof clx) {
            cnh cnhVar = this.F;
            bp bpVar = ((bo) buVar2).a;
            cnhVar.getClass();
            bpVar.i.remove(cnhVar);
        }
        ?? r0 = this.m;
        if (r0 instanceof clw) {
            r0.f(this.E);
        }
        bu buVar3 = this.m;
        if (buVar3 instanceof dc) {
            cnh cnhVar2 = this.G;
            bp bpVar2 = ((bo) buVar3).a;
            cnhVar2.getClass();
            bpVar2.k.remove(cnhVar2);
        }
        bu buVar4 = this.m;
        if (buVar4 instanceof dd) {
            cnh cnhVar3 = this.H;
            bp bpVar3 = ((bo) buVar4).a;
            cnhVar3.getClass();
            bpVar3.l.remove(cnhVar3);
        }
        bu buVar5 = this.m;
        if ((buVar5 instanceof cns) && this.o == null) {
            rnu rnuVar = this.O;
            bp bpVar4 = ((bo) buVar5).a;
            rnuVar.getClass();
            got gotVar = bpVar4.n;
            ((CopyOnWriteArrayList) gotVar.a).remove(rnuVar);
            if (((coi) gotVar.c.remove(rnuVar)) != null) {
                throw null;
            }
            gotVar.b.run();
        }
        this.m = null;
        this.n = null;
        this.o = null;
        if (this.e != null) {
            Iterator it3 = this.h.c.iterator();
            while (it3.hasNext()) {
                ((nb) it3.next()).b();
            }
            this.e = null;
        }
        oc ocVar = this.q;
        if (ocVar != null) {
            ocVar.a();
            this.r.a();
            this.s.a();
        }
    }

    final void t(boolean z) {
        if (z && (this.m instanceof clx)) {
            at(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (bm bmVar : this.b.g()) {
            if (bmVar != null) {
                bmVar.onLowMemory();
                if (z) {
                    bmVar.C.t(true);
                }
            }
        }
    }

    final void u(boolean z, boolean z2) {
        if (z2 && (this.m instanceof dc)) {
            at(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (bm bmVar : this.b.g()) {
            if (bmVar != null && z2) {
                bmVar.C.u(z, true);
            }
        }
    }

    final void v() {
        for (bm bmVar : this.b.f()) {
            if (bmVar != null) {
                bmVar.C.v();
            }
        }
    }

    public final void w(Menu menu) {
        if (this.l <= 0) {
            return;
        }
        for (bm bmVar : this.b.g()) {
            if (bmVar != null && !bmVar.H) {
                bmVar.C.w(menu);
            }
        }
    }

    public final void x(bm bmVar) {
        if (bmVar == null || !bmVar.equals(c(bmVar.k))) {
            return;
        }
        boolean Z = bmVar.A.Z(bmVar);
        Boolean bool = bmVar.p;
        if (bool == null || bool.booleanValue() != Z) {
            bmVar.p = Boolean.valueOf(Z);
            ch chVar = bmVar.C;
            chVar.S();
            chVar.x(chVar.p);
        }
    }

    final void y() {
        C(5);
    }

    final void z(boolean z, boolean z2) {
        if (z2 && (this.m instanceof dd)) {
            at(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (bm bmVar : this.b.g()) {
            if (bmVar != null && z2) {
                bmVar.C.z(z, true);
            }
        }
    }

    final void R(bm bmVar) {
        if (bmVar != null && (!bmVar.equals(c(bmVar.k)) || (bmVar.B != null && bmVar.A != this))) {
            throw new IllegalArgumentException(a.bC(this, bmVar, "Fragment ", CZAHo.wAOIiS));
        }
        bm bmVar2 = this.p;
        this.p = bmVar;
        x(bmVar2);
        x(this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        bm bmVar = this.o;
        if (bmVar != null) {
            sb.append(bmVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.o)));
            sb.append("}");
        } else {
            bu buVar = this.m;
            if (buVar != null) {
                sb.append(buVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.m)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append(OPuAVreQM.sbxbPDYZinsff);
        return sb.toString();
    }
}
