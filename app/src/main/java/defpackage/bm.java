package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bm implements ComponentCallbacks, View.OnCreateContextMenuListener, cwh, cxt, cvw, deu {
    static final Object e = new Object();
    ch A;
    bu B;
    ch C;
    public bm D;
    int E;
    int F;
    public String G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    public boolean N;
    public ViewGroup O;
    public View P;
    boolean Q;
    boolean R;
    public bi S;
    Handler T;
    Runnable U;
    boolean V;
    public LayoutInflater W;
    boolean X;
    cwb Y;
    cz Z;
    private int a;
    cwq aa;
    cxp ab;
    public final AtomicInteger ac;
    public final ArrayList ad;
    cwc ae;
    byz af;
    private final bk b;
    int f;
    Bundle g;
    SparseArray h;
    Bundle i;
    Boolean j;
    String k;
    public Bundle l;
    bm m;
    public String mPreviousWho;
    String n;
    int o;
    public Boolean p;
    boolean q;
    public boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    int z;

    public bm() {
        this.f = -1;
        this.k = UUID.randomUUID().toString();
        this.n = null;
        this.p = null;
        this.C = new ch();
        this.M = true;
        this.R = true;
        this.U = new av(this, 5, null);
        this.Y = cwb.e;
        this.aa = new cwq();
        this.ac = new AtomicInteger();
        this.ad = new ArrayList();
        this.b = new bd(this);
        dC();
    }

    private final void B(bk bkVar) {
        if (this.f >= 0) {
            bkVar.a();
        } else {
            this.ad.add(bkVar);
        }
    }

    private final int c() {
        cwb cwbVar = this.Y;
        return (cwbVar == cwb.b || this.D == null) ? cwbVar.ordinal() : Math.min(cwbVar.ordinal(), this.D.c());
    }

    private final bm d(boolean z) {
        String str;
        if (z) {
            int i = cui.a;
            cum cumVar = new cum(this);
            cui.d(cumVar);
            cuh cuhVarB = cui.b(this);
            if (cuhVarB.b.contains(cug.h) && cui.e(cuhVarB, getClass(), cumVar.getClass())) {
                cui.c(cuhVarB, cumVar);
            }
        }
        bm bmVar = this.m;
        if (bmVar != null) {
            return bmVar;
        }
        ch chVar = this.A;
        if (chVar == null || (str = this.n) == null) {
            return null;
        }
        return chVar.c(str);
    }

    private final void dC() {
        this.ae = new cwc(this);
        this.af = coe.k(this);
        this.ab = null;
        ArrayList arrayList = this.ad;
        bk bkVar = this.b;
        if (arrayList.contains(bkVar)) {
            return;
        }
        B(bkVar);
    }

    private final oc e(ok okVar, pa paVar, ob obVar) {
        if (this.f > 1) {
            throw new IllegalStateException(a.bz(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        B(new bh(this, paVar, new AtomicReference(), okVar, obVar));
        return new bc();
    }

    @Deprecated
    public static bm instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    final cgh A() {
        bi biVar = this.S;
        if (biVar == null) {
            return null;
        }
        return biVar.u;
    }

    public br dB() {
        return new be(this);
    }

    public void fh(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.C.L();
        this.y = true;
        this.Z = new cz(this, getViewModelStore$ar$class_merging(), new av(this, 4));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.P = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.Z.a != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.Z = null;
            return;
        }
        this.Z.b();
        if (ch.X(3)) {
            Objects.toString(this.P);
            toString();
        }
        col.f(this.P, this.Z);
        col.d(this.P, this.Z);
        coe.i(this.P, this.Z);
        this.aa.h(this.Z);
    }

    public final int g() {
        bi biVar = this.S;
        if (biVar == null) {
            return 0;
        }
        return biVar.b;
    }

    public final bp getActivity() {
        bu buVar = this.B;
        if (buVar == null) {
            return null;
        }
        return (bp) buVar.b;
    }

    public final boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        bi biVar = this.S;
        if (biVar == null || (bool = biVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        bi biVar = this.S;
        if (biVar == null || (bool = biVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final Bundle getArguments() {
        return this.l;
    }

    public final ch getChildFragmentManager() {
        if (this.B != null) {
            return this.C;
        }
        throw new IllegalStateException(a.bz(this, "Fragment ", " has not been attached yet."));
    }

    public final Context getContext() {
        bu buVar = this.B;
        if (buVar == null) {
            return null;
        }
        return buVar.c;
    }

    @Override // defpackage.cvw
    public final cxy getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && ch.X(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        cxz cxzVar = new cxz();
        if (application != null) {
            cxzVar.b(cxo.b, application);
        }
        cxzVar.b(cxf.a, this);
        cxzVar.b(cxf.b, this);
        Bundle bundle = this.l;
        if (bundle != null) {
            cxzVar.b(cxf.c, bundle);
        }
        return cxzVar;
    }

    @Override // defpackage.cvw
    public final cxp getDefaultViewModelProviderFactory() {
        Application application;
        if (this.A == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.ab == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && ch.X(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.ab = new cxi(application, this, this.l);
        }
        return this.ab;
    }

    public final Object getEnterTransition() {
        bi biVar = this.S;
        if (biVar == null) {
            return null;
        }
        return biVar.i;
    }

    public final Object getExitTransition() {
        bi biVar = this.S;
        if (biVar == null) {
            return null;
        }
        return biVar.k;
    }

    @Deprecated
    public final ch getFragmentManager() {
        return this.A;
    }

    public final Object getHost() {
        bu buVar = this.B;
        if (buVar == null) {
            return null;
        }
        return ((bo) buVar).a;
    }

    public final int getId() {
        return this.E;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.W;
        return layoutInflater == null ? l(null) : layoutInflater;
    }

    @Override // defpackage.cwh
    public final cwc getLifecycle() {
        return this.ae;
    }

    @Deprecated
    public final cyc getLoaderManager() {
        return cyc.a(this);
    }

    public final bm getParentFragment() {
        return this.D;
    }

    public final ch getParentFragmentManager() {
        ch chVar = this.A;
        if (chVar != null) {
            return chVar;
        }
        throw new IllegalStateException(a.bz(this, "Fragment ", " not associated with a fragment manager."));
    }

    public final Object getReenterTransition() {
        bi biVar = this.S;
        if (biVar == null) {
            return null;
        }
        Object obj = biVar.l;
        return obj == e ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        int i = cui.a;
        cuk cukVar = new cuk(this);
        cui.d(cukVar);
        cuh cuhVarB = cui.b(this);
        if (cuhVarB.b.contains(cug.f) && cui.e(cuhVarB, getClass(), cukVar.getClass())) {
            cui.c(cuhVarB, cukVar);
        }
        return this.J;
    }

    public final Object getReturnTransition() {
        bi biVar = this.S;
        if (biVar == null) {
            return null;
        }
        Object obj = biVar.j;
        return obj == e ? getEnterTransition() : obj;
    }

    @Override // defpackage.deu
    public final det getSavedStateRegistry() {
        return (det) this.af.a;
    }

    public final Object getSharedElementEnterTransition() {
        bi biVar = this.S;
        if (biVar == null) {
            return null;
        }
        return biVar.m;
    }

    public final Object getSharedElementReturnTransition() {
        bi biVar = this.S;
        if (biVar == null) {
            return null;
        }
        Object obj = biVar.n;
        return obj == e ? getSharedElementEnterTransition() : obj;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.G;
    }

    @Deprecated
    public final bm getTargetFragment() {
        return d(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        int i = cui.a;
        cul culVar = new cul(this);
        cui.d(culVar);
        cuh cuhVarB = cui.b(this);
        if (cuhVarB.b.contains(cug.h) && cui.e(cuhVarB, getClass(), culVar.getClass())) {
            cui.c(cuhVarB, culVar);
        }
        return this.o;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public final boolean getUserVisibleHint() {
        return this.R;
    }

    public final View getView() {
        return this.P;
    }

    public final cwh getViewLifecycleOwner() {
        cz czVar = this.Z;
        if (czVar != null) {
            return czVar;
        }
        throw new IllegalStateException(a.bz(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final cwp getViewLifecycleOwnerLiveData() {
        return this.aa;
    }

    @Override // defpackage.cxt
    public final cxb getViewModelStore$ar$class_merging() {
        if (this.A == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (c() == cwb.b.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.A.y.d;
        cxb cxbVar = (cxb) map.get(this.k);
        if (cxbVar != null) {
            return cxbVar;
        }
        cxb cxbVar2 = new cxb((byte[]) null);
        map.put(this.k, cxbVar2);
        return cxbVar2;
    }

    public final int h() {
        bi biVar = this.S;
        if (biVar == null) {
            return 0;
        }
        return biVar.c;
    }

    public final boolean hasOptionsMenu() {
        return this.L;
    }

    public final int i() {
        bi biVar = this.S;
        if (biVar == null) {
            return 0;
        }
        return biVar.d;
    }

    public final boolean isAdded() {
        return this.B != null && this.q;
    }

    public final boolean isDetached() {
        return this.I;
    }

    public final boolean isHidden() {
        bm bmVar;
        if (this.H) {
            return true;
        }
        return (this.A == null || (bmVar = this.D) == null || !bmVar.isHidden()) ? false : true;
    }

    public final boolean isInLayout() {
        return this.v;
    }

    public final boolean isMenuVisible() {
        if (this.M) {
            return this.A == null || ch.ae(this.D);
        }
        return false;
    }

    public final boolean isRemoving() {
        return this.r;
    }

    public final boolean isResumed() {
        return this.f >= 7;
    }

    public final boolean isStateSaved() {
        ch chVar = this.A;
        if (chVar == null) {
            return false;
        }
        return chVar.aa();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.P) == null || view.getWindowToken() == null || this.P.getVisibility() != 0) ? false : true;
    }

    public final int j() {
        bi biVar = this.S;
        if (biVar == null) {
            return 0;
        }
        return biVar.e;
    }

    public final bi k() {
        if (this.S == null) {
            this.S = new bi();
        }
        return this.S;
    }

    public final LayoutInflater l(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.W = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    final ArrayList m() {
        ArrayList arrayList;
        bi biVar = this.S;
        return (biVar == null || (arrayList = biVar.g) == null) ? new ArrayList() : arrayList;
    }

    final ArrayList n() {
        ArrayList arrayList;
        bi biVar = this.S;
        return (biVar == null || (arrayList = biVar.h) == null) ? new ArrayList() : arrayList;
    }

    final void o(boolean z) {
        ViewGroup viewGroup;
        ch chVar;
        bi biVar = this.S;
        if (biVar != null) {
            biVar.s = false;
        }
        if (this.P == null || (viewGroup = this.O) == null || (chVar = this.A) == null) {
            return;
        }
        dh dhVarC = dh.c(viewGroup, chVar);
        dhVarC.h();
        if (z) {
            this.B.d.post(new av(dhVarC, 7, null));
        } else {
            dhVarC.f();
        }
        Handler handler = this.T;
        if (handler != null) {
            handler.removeCallbacks(this.U);
            this.T = null;
        }
    }

    @Deprecated
    public final void onActivityCreated(Bundle bundle) {
        this.N = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (ch.X(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @Deprecated
    public final void onAttach(Activity activity) {
        this.N = true;
    }

    @Deprecated
    public final void onAttachFragment(bm bmVar) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.N = true;
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.N = true;
        r();
        ch chVar = this.C;
        if (chVar.l > 0) {
            return;
        }
        chVar.r();
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.a;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.N = true;
    }

    @Deprecated
    public final void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.N = true;
    }

    public void onDetach() {
        this.N = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public final void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.N = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.N = true;
    }

    public final void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public final void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.N = true;
    }

    public final void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public final void onPrepareOptionsMenu(Menu menu) {
    }

    public final void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.N = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.N = true;
    }

    public void onStop() {
        this.N = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.N = true;
    }

    final void p() {
        dC();
        this.mPreviousWho = this.k;
        this.k = UUID.randomUUID().toString();
        this.q = false;
        this.r = false;
        this.u = false;
        this.v = false;
        this.x = false;
        this.z = 0;
        this.A = null;
        this.C = new ch();
        this.B = null;
        this.E = 0;
        this.F = 0;
        this.G = null;
        this.H = false;
        this.I = false;
    }

    public final void postponeEnterTransition() {
        k().s = true;
    }

    final void q() {
        Bundle bundle = this.g;
        onViewCreated(this.P, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.C.C(2);
    }

    final void r() {
        Bundle bundle;
        Bundle bundle2 = this.g;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.C.O(bundle);
        this.C.r();
    }

    public final oc registerForActivityResult(ok okVar, ob obVar) {
        return e(okVar, new bg(this, 1), obVar);
    }

    public final void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.B == null) {
            throw new IllegalStateException(a.bz(this, "Fragment ", " not attached to Activity"));
        }
        ch parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.s == null) {
            strArr.getClass();
            return;
        }
        parentFragmentManager.t.addLast(new cc(this.k, i));
        parentFragmentManager.s.b(strArr);
    }

    public final bp requireActivity() {
        bp activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(a.bz(this, "Fragment ", " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle bundle = this.l;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a.bz(this, "Fragment ", " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a.bz(this, "Fragment ", " not attached to a context."));
    }

    @Deprecated
    public final ch requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(a.bz(this, "Fragment ", " not attached to a host."));
    }

    public final bm requireParentFragment() {
        bm bmVar = this.D;
        if (bmVar != null) {
            return bmVar;
        }
        if (getContext() == null) {
            throw new IllegalStateException(a.bz(this, "Fragment ", " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = this.P;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.bz(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void s(int i, int i2, int i3, int i4) {
        if (this.S == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        k().b = i;
        k().c = i2;
        k().d = i3;
        k().e = i4;
    }

    public final void setAllowEnterTransitionOverlap(boolean z) {
        k().p = Boolean.valueOf(z);
    }

    public final void setAllowReturnTransitionOverlap(boolean z) {
        k().o = Boolean.valueOf(z);
    }

    public final void setArguments(Bundle bundle) {
        ch chVar = this.A;
        if (chVar != null && chVar.aa()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.l = bundle;
    }

    public final void setEnterSharedElementCallback$ar$class_merging$ar$class_merging(cgh cghVar) {
        k().t = cghVar;
    }

    public final void setEnterTransition(Object obj) {
        k().i = obj;
    }

    public final void setExitSharedElementCallback$ar$class_merging$ar$class_merging(cgh cghVar) {
        k().u = cghVar;
    }

    public final void setExitTransition(Object obj) {
        k().k = obj;
    }

    @Deprecated
    public final void setHasOptionsMenu(boolean z) {
        if (this.L != z) {
            this.L = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.B.e();
        }
    }

    public final void setInitialSavedState(bl blVar) {
        Bundle bundle;
        if (this.A != null) {
            throw new IllegalStateException("Fragment already added");
        }
        Bundle bundle2 = null;
        if (blVar != null && (bundle = blVar.a) != null) {
            bundle2 = bundle;
        }
        this.g = bundle2;
    }

    public final void setMenuVisibility(boolean z) {
        if (this.M != z) {
            this.M = z;
            if (this.L && isAdded() && !isHidden()) {
                this.B.e();
            }
        }
    }

    public final void setReenterTransition(Object obj) {
        k().l = obj;
    }

    @Deprecated
    public final void setRetainInstance(boolean z) {
        int i = cui.a;
        cuo cuoVar = new cuo(this);
        cui.d(cuoVar);
        cuh cuhVarB = cui.b(this);
        if (cuhVarB.b.contains(cug.f) && cui.e(cuhVarB, getClass(), cuoVar.getClass())) {
            cui.c(cuhVarB, cuoVar);
        }
        this.J = z;
        ch chVar = this.A;
        if (chVar == null) {
            this.K = true;
        } else if (z) {
            chVar.y.a(this);
        } else {
            chVar.y.e(this);
        }
    }

    public final void setReturnTransition(Object obj) {
        k().j = obj;
    }

    public final void setSharedElementEnterTransition(Object obj) {
        k().m = obj;
    }

    public final void setSharedElementReturnTransition(Object obj) {
        k().n = obj;
    }

    @Deprecated
    public final void setUserVisibleHint(boolean z) {
        ch chVar;
        int i = cui.a;
        cuq cuqVar = new cuq(this, z);
        cui.d(cuqVar);
        cuh cuhVarB = cui.b(this);
        if (cuhVarB.b.contains(cug.g) && cui.e(cuhVarB, getClass(), cuqVar.getClass())) {
            cui.c(cuhVarB, cuqVar);
        }
        if (!this.R && z && this.f < 5 && (chVar = this.A) != null && isAdded() && this.X) {
            chVar.M(chVar.j(this));
        }
        this.R = z;
        boolean z2 = false;
        if (this.f < 5 && !z) {
            z2 = true;
        }
        this.Q = z2;
        if (this.g != null) {
            this.j = Boolean.valueOf(z);
        }
    }

    public final boolean shouldShowRequestPermissionRationale(String str) {
        bu buVar = this.B;
        if (buVar != null) {
            return ((bo) buVar).a.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public final void startActivity(Intent intent) {
        bu buVar = this.B;
        if (buVar == null) {
            throw new IllegalStateException(a.bz(this, "Fragment ", " not attached to Activity"));
        }
        buVar.h(intent, -1, null);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        if (this.B == null) {
            throw new IllegalStateException(a.bz(this, "Fragment ", " not attached to Activity"));
        }
        ch parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.q == null) {
            parentFragmentManager.m.h(intent, i, null);
            return;
        }
        parentFragmentManager.t.addLast(new cc(this.k, i));
        parentFragmentManager.q.b(intent);
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.B == null) {
            throw new IllegalStateException(a.bz(this, "Fragment ", " not attached to Activity"));
        }
        if (ch.X(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        ch parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.r == null) {
            bu buVar = parentFragmentManager.m;
            intentSender.getClass();
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            buVar.b.startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (ch.X(2)) {
                Objects.toString(bundle);
                Objects.toString(intent2);
                toString();
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        oi oiVar = new oi(intentSender);
        oiVar.a = intent2;
        oiVar.b(i3, i2);
        oj ojVarA = oiVar.a();
        parentFragmentManager.t.addLast(new cc(this.k, i));
        if (ch.X(2)) {
            toString();
        }
        parentFragmentManager.r.b(ojVarA);
    }

    public final void startPostponedEnterTransition() {
        if (this.S == null || !k().s) {
            return;
        }
        if (this.B == null) {
            k().s = false;
        } else if (Looper.myLooper() != this.B.d.getLooper()) {
            this.B.d.postAtFrontOfQueue(new av(this, 6, null));
        } else {
            o(true);
        }
    }

    final void t(View view) {
        k().r = view;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.k);
        if (this.E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.E));
        }
        if (this.G != null) {
            sb.append(" tag=");
            sb.append(this.G);
        }
        sb.append(")");
        return sb.toString();
    }

    final void u(int i) {
        if (this.S == null && i == 0) {
            return;
        }
        k();
        this.S.f = i;
    }

    public final void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    final void v(boolean z) {
        if (this.S == null) {
            return;
        }
        k().a = z;
    }

    final void w(ArrayList arrayList, ArrayList arrayList2) {
        k();
        bi biVar = this.S;
        biVar.g = arrayList;
        biVar.h = arrayList2;
    }

    final boolean x() {
        bi biVar = this.S;
        if (biVar == null) {
            return false;
        }
        return biVar.a;
    }

    final boolean y() {
        return this.z > 0;
    }

    final cgh z() {
        bi biVar = this.S;
        if (biVar == null) {
            return null;
        }
        return biVar.t;
    }

    @Deprecated
    public static bm instantiate(Context context, String str, Bundle bundle) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = bt.a;
            try {
                bm bmVar = (bm) bt.a(classLoader, str).getConstructor(null).newInstance(null);
                if (bundle != null) {
                    bundle.setClassLoader(bmVar.getClass().getClassLoader());
                    bmVar.setArguments(bundle);
                }
                return bmVar;
            } catch (ClassCastException e2) {
                throw new bj("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
            } catch (ClassNotFoundException e3) {
                throw new bj("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
            }
        } catch (IllegalAccessException e4) {
            throw new bj(a.bw(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e5) {
            throw new bj(a.bw(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (NoSuchMethodException e6) {
            throw new bj(a.bw(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e6);
        } catch (InvocationTargetException e7) {
            throw new bj(a.bw(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e7);
        }
    }

    @Deprecated
    public final LayoutInflater getLayoutInflater(Bundle bundle) {
        bu buVar = this.B;
        if (buVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        bp bpVar = ((bo) buVar).a;
        LayoutInflater layoutInflaterCloneInContext = bpVar.getLayoutInflater().cloneInContext(bpVar);
        layoutInflaterCloneInContext.setFactory2(this.C.d);
        return layoutInflaterCloneInContext;
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public void onAttach(Context context) {
        this.N = true;
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.N = true;
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        k().s = true;
        Handler handler = this.T;
        if (handler != null) {
            handler.removeCallbacks(this.U);
        }
        ch chVar = this.A;
        if (chVar != null) {
            this.T = chVar.m.d;
        } else {
            this.T = new Handler(Looper.getMainLooper());
        }
        this.T.removeCallbacks(this.U);
        this.T.postDelayed(this.U, timeUnit.toMillis(j));
    }

    public final oc registerForActivityResult(ok okVar, og ogVar, ob obVar) {
        return e(okVar, new bg(ogVar, 0), obVar);
    }

    @Deprecated
    public final void setTargetFragment(bm bmVar, int i) {
        if (bmVar != null) {
            int i2 = cui.a;
            cup cupVar = new cup(this, bmVar, i);
            cui.d(cupVar);
            cuh cuhVarB = cui.b(this);
            if (cuhVarB.b.contains(cug.h) && cui.e(cuhVarB, getClass(), cupVar.getClass())) {
                cui.c(cuhVarB, cupVar);
            }
        }
        ch chVar = this.A;
        ch chVar2 = bmVar != null ? bmVar.A : null;
        if (chVar != null && chVar2 != null && chVar != chVar2) {
            throw new IllegalArgumentException(a.bz(bmVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (bm bmVarD = bmVar; bmVarD != null; bmVarD = bmVarD.d(false)) {
            if (bmVarD.equals(this)) {
                throw new IllegalArgumentException(a.bA(this, bmVar, yoGAhrpjU.zgFgOh, " as the target of ", " would create a target cycle"));
            }
        }
        if (bmVar == null) {
            this.n = null;
        } else {
            if (this.A == null || bmVar.A == null) {
                this.n = null;
                this.m = bmVar;
                this.o = i;
            }
            this.n = bmVar.k;
        }
        this.m = null;
        this.o = i;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(PNlJufQ.eJygnBpyX);
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mTag=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f);
        printWriter.print(" mWho=");
        printWriter.print(this.k);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.q);
        printWriter.print(" mRemoving=");
        printWriter.print(this.r);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.u);
        printWriter.print(" mInLayout=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.H);
        printWriter.print(" mDetached=");
        printWriter.print(this.I);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.M);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.L);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.J);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.R);
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A);
        }
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.B);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.D);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.l);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.g);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.i);
        }
        bm bmVarD = d(false);
        if (bmVarD != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(bmVarD);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(x());
        if (g() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(g());
        }
        if (h() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(h());
        }
        if (i() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(i());
        }
        if (j() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(j());
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.O);
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.P);
        }
        if (getContext() != null) {
            cyc.a(this).c(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.C + GdpuLBytnYW.fmufC);
        this.C.E(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        bu buVar = this.B;
        if (buVar != null) {
            buVar.h(intent, -1, bundle);
            return;
        }
        throw new IllegalStateException(a.bz(this, "Fragment ", " not attached to Activity"));
    }

    public bm(int i) {
        this();
        this.a = i;
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.B != null) {
            ch parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.q != null) {
                parentFragmentManager.t.addLast(new cc(this.k, i));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.q.b(intent);
                return;
            }
            parentFragmentManager.m.h(intent, i, bundle);
            return;
        }
        throw new IllegalStateException(a.bz(this, "Fragment ", " not attached to Activity"));
    }
}
