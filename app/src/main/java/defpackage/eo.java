package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eo extends dz implements LayoutInflater.Factory2, fz {
    private static final aaa J = new aaa();
    private static final int[] K = {R.attr.windowBackground};
    public static final boolean f = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    boolean B;
    public Configuration C;
    public int D;
    boolean E;
    int F;
    public Rect G;
    public Rect H;
    private CharSequence L;
    private en M;
    private TextView N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private em[] R;
    private boolean S;
    private boolean T;
    private int U;
    private int V;
    private boolean W;
    private ej X;
    private ej Y;
    private boolean aa;
    private AppCompatViewInflater ab;
    private OnBackInvokedDispatcher ac;
    private OnBackInvokedCallback ad;
    private en ae;
    public final Object g;
    final Context h;
    public Window i;
    public eg j;
    public dm k;
    public MenuInflater l;
    public iw m;
    ff n;
    public ActionBarContextView o;
    public PopupWindow p;
    public Runnable q;
    public boolean s;
    ViewGroup t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    public em z;
    public ejs I = null;
    public boolean r = true;
    private final Runnable Z = new ea(this, 0);

    public eo(Context context, Window window, Object obj) {
        dx dxVar = null;
        this.U = -100;
        this.h = context;
        this.g = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof dx)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        dxVar = (dx) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (dxVar != null) {
                this.U = ((eo) dxVar.i()).U;
            }
        }
        if (this.U == -100) {
            aaa aaaVar = J;
            Integer num = (Integer) aaaVar.get(this.g.getClass().getName());
            if (num != null) {
                this.U = num.intValue();
                aaaVar.remove(this.g.getClass().getName());
            }
        }
        if (window != null) {
            S(window);
        }
        hr.f();
    }

    private final ej Q(Context context) {
        if (this.Y == null) {
            this.Y = new eh(this, context);
        }
        return this.Y;
    }

    private final ej R(Context context) {
        if (this.X == null) {
            if (tdy.d == null) {
                Context applicationContext = context.getApplicationContext();
                tdy.d = new tdy(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.X = new ek(this, tdy.d);
        }
        return this.X;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void S(android.view.Window r4) {
        /*
            r3 = this;
            android.view.Window r0 = r3.i
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L55
            android.view.Window$Callback r0 = r4.getCallback()
            boolean r2 = r0 instanceof defpackage.eg
            if (r2 != 0) goto L4f
            eg r1 = new eg
            r1.<init>(r3, r0)
            r3.j = r1
            r4.setCallback(r1)
            android.content.Context r0 = r3.h
            int[] r1 = defpackage.eo.K
            r2 = 0
            pmg r0 = defpackage.pmg.I(r0, r2, r1)
            r1 = 0
            android.graphics.drawable.Drawable r1 = r0.A(r1)
            if (r1 == 0) goto L2b
            r4.setBackgroundDrawable(r1)
        L2b:
            r0.D()
            r3.i = r4
            android.window.OnBackInvokedDispatcher r4 = r3.ac
            if (r4 != 0) goto L4e
            java.lang.Object r4 = r3.g
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L49
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L49
            android.window.OnBackInvokedDispatcher r4 = r4.getOnBackInvokedDispatcher()
            r3.ac = r4
            goto L4b
        L49:
            r3.ac = r2
        L4b:
            r3.E()
        L4e:
            return
        L4f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        L55:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.S(android.view.Window):void");
    }

    private final void T() {
        if (this.i == null) {
            Object obj = this.g;
            if (obj instanceof Activity) {
                S(((Activity) obj).getWindow());
            }
        }
        if (this.i == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void U(int i) {
        this.F = (1 << i) | this.F;
        if (this.E) {
            return;
        }
        View decorView = this.i.getDecorView();
        Runnable runnable = this.Z;
        int[] iArr = con.a;
        decorView.postOnAnimation(runnable);
        this.E = true;
    }

    private final void W() {
        if (this.s) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void A() {
        ejs ejsVar = this.I;
        if (ejsVar != null) {
            ejsVar.i();
        }
    }

    public final void B() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.s) {
            return;
        }
        Context onVar = this.h;
        TypedArray typedArrayObtainStyledAttributes = onVar.obtainStyledAttributes(fa.j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            p(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            p(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            p(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            p(10);
        }
        this.x = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        T();
        this.i.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(onVar);
        if (this.y) {
            viewGroup = this.w ? (ViewGroup) layoutInflaterFrom.inflate(com.google.ar.core.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.google.ar.core.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.x) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.ar.core.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.v = false;
            this.u = false;
        } else if (this.u) {
            TypedValue typedValue = new TypedValue();
            onVar.getTheme().resolveAttribute(com.google.ar.core.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                onVar = new on(onVar, typedValue.resourceId);
            }
            viewGroup = (ViewGroup) LayoutInflater.from(onVar).inflate(com.google.ar.core.R.layout.abc_screen_toolbar, (ViewGroup) null);
            iw iwVar = (iw) viewGroup.findViewById(com.google.ar.core.R.id.decor_content_parent);
            this.m = iwVar;
            iwVar.n(u());
            if (this.v) {
                this.m.c(109);
            }
            if (this.O) {
                this.m.c(2);
            }
            if (this.P) {
                this.m.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.u + ", windowActionBarOverlay: " + this.v + ", android:windowIsFloating: " + this.x + ", windowActionModeOverlay: " + this.w + ", windowNoTitle: " + this.y + " }");
        }
        eb ebVar = new eb(this);
        int[] iArr = con.a;
        cog.i(viewGroup, ebVar);
        if (this.m == null) {
            this.N = (TextView) viewGroup.findViewById(com.google.ar.core.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.ar.core.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.i.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.i.setContentView(viewGroup);
        contentFrameLayout.i = new rnu(this);
        this.t = viewGroup;
        CharSequence charSequenceV = v();
        if (!TextUtils.isEmpty(charSequenceV)) {
            iw iwVar2 = this.m;
            if (iwVar2 != null) {
                iwVar2.o(charSequenceV);
            } else {
                dm dmVar = this.k;
                if (dmVar != null) {
                    dmVar.j(charSequenceV);
                } else {
                    TextView textView = this.N;
                    if (textView != null) {
                        textView.setText(charSequenceV);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.t.findViewById(R.id.content);
        View decorView = this.i.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.h.obtainStyledAttributes(fa.j);
        if (contentFrameLayout2.b == null) {
            contentFrameLayout2.b = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
        if (contentFrameLayout2.c == null) {
            contentFrameLayout2.c = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
        if (typedArrayObtainStyledAttributes2.hasValue(ScriptIntrinsicBLAS.LOWER)) {
            if (contentFrameLayout2.d == null) {
                contentFrameLayout2.d = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(ScriptIntrinsicBLAS.LOWER, contentFrameLayout2.d);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            if (contentFrameLayout2.e == null) {
                contentFrameLayout2.e = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.f == null) {
                contentFrameLayout2.f = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(ScriptIntrinsicBLAS.UPPER)) {
            if (contentFrameLayout2.g == null) {
                contentFrameLayout2.g = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(ScriptIntrinsicBLAS.UPPER, contentFrameLayout2.g);
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.s = true;
        em emVarM = M(0);
        if (this.B || emVarM.h != null) {
            return;
        }
        U(108);
    }

    public final void C() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B();
        if (this.u && this.k == null) {
            Object obj = this.g;
            if (obj instanceof Activity) {
                this.k = new ez((Activity) obj, this.v);
            } else if (obj instanceof Dialog) {
                this.k = new ez((Dialog) obj);
            }
            dm dmVar = this.k;
            if (dmVar != null) {
                dmVar.f(this.aa);
            }
        }
    }

    @Override // defpackage.fz
    public final void D(gb gbVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        iw iwVar = this.m;
        if (iwVar == null || !iwVar.p() || (ViewConfiguration.get(this.h).hasPermanentMenuKey() && !this.m.r())) {
            em emVarM = M(0);
            emVarM.n = true;
            y(emVarM, false);
            V(emVarM, null);
            return;
        }
        Window.Callback callbackU = u();
        if (this.m.s()) {
            this.m.q();
            if (this.B) {
                return;
            }
            callbackU.onPanelClosed(108, M(0).h);
            return;
        }
        if (callbackU == null || this.B) {
            return;
        }
        if (this.E && (1 & this.F) != 0) {
            View decorView = this.i.getDecorView();
            Runnable runnable = this.Z;
            decorView.removeCallbacks(runnable);
            runnable.run();
        }
        em emVarM2 = M(0);
        gb gbVar2 = emVarM2.h;
        if (gbVar2 == null || emVarM2.o || !callbackU.onPreparePanel(0, emVarM2.g, gbVar2)) {
            return;
        }
        callbackU.onMenuOpened(108, emVarM2.h);
        this.m.u();
    }

    final void E() {
        if (this.ac == null || (!M(0).m && this.n == null)) {
            OnBackInvokedCallback onBackInvokedCallback = this.ad;
            if (onBackInvokedCallback != null) {
                this.ac.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                this.ad = null;
                return;
            }
            return;
        }
        if (this.ad == null) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.ac;
            mc mcVar = new mc(this, 1);
            onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, mcVar);
            this.ad = mcVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean F(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.F(android.view.KeyEvent):boolean");
    }

    public final boolean G() {
        boolean z = this.S;
        this.S = false;
        em emVarM = M(0);
        if (emVarM.m) {
            if (!z) {
                y(emVarM, true);
            }
            return true;
        }
        ff ffVar = this.n;
        if (ffVar != null) {
            ffVar.f();
            return true;
        }
        dm dmVarB = b();
        return dmVarB != null && dmVarB.l();
    }

    @Override // defpackage.fz
    public final boolean H(gb gbVar, MenuItem menuItem) {
        em emVarT;
        Window.Callback callbackU = u();
        if (callbackU == null || this.B || (emVarT = t(gbVar.a())) == null) {
            return false;
        }
        return callbackU.onMenuItemSelected(emVarT.a, menuItem);
    }

    public final boolean I(em emVar, KeyEvent keyEvent) {
        iw iwVar;
        iw iwVar2;
        Resources.Theme themeNewTheme;
        iw iwVar3;
        iw iwVar4;
        if (this.B) {
            return false;
        }
        if (emVar.k) {
            return true;
        }
        em emVar2 = this.z;
        if (emVar2 != null && emVar2 != emVar) {
            y(emVar2, false);
        }
        Window.Callback callbackU = u();
        if (callbackU != null) {
            emVar.g = callbackU.onCreatePanelView(emVar.a);
        }
        int i = emVar.a;
        boolean z = i == 0 || i == 108;
        if (z && (iwVar4 = this.m) != null) {
            iwVar4.m();
        }
        if (emVar.g == null && (!z || !(this.k instanceof eu))) {
            gb gbVar = emVar.h;
            if (gbVar == null || emVar.o) {
                if (gbVar == null) {
                    Context context = this.h;
                    if ((i == 0 || i == 108) && this.m != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.google.ar.core.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.google.ar.core.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.google.ar.core.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            on onVar = new on(context, 0);
                            onVar.getTheme().setTo(themeNewTheme);
                            context = onVar;
                        }
                    }
                    gb gbVar2 = new gb(context);
                    gbVar2.b = this;
                    emVar.a(gbVar2);
                    if (emVar.h == null) {
                        return false;
                    }
                }
                if (z && (iwVar2 = this.m) != null) {
                    if (this.ae == null) {
                        this.ae = new en(this, 1);
                    }
                    iwVar2.l(emVar.h, this.ae);
                }
                emVar.h.s();
                if (!callbackU.onCreatePanelMenu(i, emVar.h)) {
                    emVar.a(null);
                    if (z && (iwVar = this.m) != null) {
                        iwVar.l(null, this.ae);
                    }
                    return false;
                }
                emVar.o = false;
            }
            emVar.h.s();
            Bundle bundle = emVar.p;
            if (bundle != null) {
                emVar.h.n(bundle);
                emVar.p = null;
            }
            if (!callbackU.onPreparePanel(0, emVar.g, emVar.h)) {
                if (z && (iwVar3 = this.m) != null) {
                    iwVar3.l(null, this.ae);
                }
                emVar.h.r();
                return false;
            }
            emVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            emVar.h.r();
        }
        emVar.k = true;
        emVar.l = false;
        this.z = emVar;
        return true;
    }

    public final boolean J() {
        ViewGroup viewGroup;
        return this.s && (viewGroup = this.t) != null && viewGroup.isLaidOut();
    }

    public final void K() throws PackageManager.NameNotFoundException {
        O(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View L(java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.L(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final em M(int i) {
        em[] emVarArr = this.R;
        if (emVarArr == null || emVarArr.length <= i) {
            em[] emVarArr2 = new em[i + 1];
            if (emVarArr != null) {
                System.arraycopy(emVarArr, 0, emVarArr2, 0, emVarArr.length);
            }
            this.R = emVarArr2;
            emVarArr = emVarArr2;
        }
        em emVar = emVarArr[i];
        if (emVar != null) {
            return emVar;
        }
        em emVar2 = new em(i);
        emVarArr[i] = emVar2;
        return emVar2;
    }

    public final boolean N(em emVar, int i, KeyEvent keyEvent) {
        gb gbVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((emVar.k || I(emVar, keyEvent)) && (gbVar = emVar.h) != null) {
            return gbVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(boolean r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.O(boolean):void");
    }

    public final Configuration P(Context context, int i, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    @Override // defpackage.dz
    public final Context a() {
        return this.h;
    }

    @Override // defpackage.dz
    public final dm b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C();
        return this.k;
    }

    @Override // defpackage.dz
    public final View c(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B();
        return this.i.findViewById(i);
    }

    @Override // defpackage.dz
    public final void d(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B();
        ((ViewGroup) this.t.findViewById(R.id.content)).addView(view, layoutParams);
        this.j.a(this.i.getCallback());
    }

    @Override // defpackage.dz
    public final void e() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.h);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    @Override // defpackage.dz
    public final void f() {
        if (this.k == null || b().m()) {
            return;
        }
        U(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    @Override // defpackage.dz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.g
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.dz.e
            monitor-enter(r0)
            defpackage.dz.i(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.E
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.i
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.Z
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.B = r0
            int r0 = r3.U
            r1 = -100
            if (r0 == r1) goto L4c
            java.lang.Object r0 = r3.g
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            if (r1 == 0) goto L4c
            aaa r1 = defpackage.eo.J
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            int r2 = r3.U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L5b
        L4c:
            java.lang.Object r0 = r3.g
            aaa r1 = defpackage.eo.J
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
        L5b:
            dm r0 = r3.k
            if (r0 == 0) goto L62
            r0.e()
        L62:
            ej r0 = r3.X
            if (r0 == 0) goto L69
            r0.c()
        L69:
            ej r3 = r3.Y
            if (r3 == 0) goto L70
            r3.c()
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.g():void");
    }

    @Override // defpackage.dz
    public final void h() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        dm dmVarB = b();
        if (dmVarB != null) {
            dmVarB.h(false);
        }
    }

    @Override // defpackage.dz
    public final void j(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B();
        ViewGroup viewGroup = (ViewGroup) this.t.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.h).inflate(i, viewGroup);
        this.j.a(this.i.getCallback());
    }

    @Override // defpackage.dz
    public final void k(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B();
        ViewGroup viewGroup = (ViewGroup) this.t.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.j.a(this.i.getCallback());
    }

    @Override // defpackage.dz
    public final void l(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B();
        ViewGroup viewGroup = (ViewGroup) this.t.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.j.a(this.i.getCallback());
    }

    @Override // defpackage.dz
    public final void m(CharSequence charSequence) {
        this.L = charSequence;
        iw iwVar = this.m;
        if (iwVar != null) {
            iwVar.o(charSequence);
            return;
        }
        dm dmVar = this.k;
        if (dmVar != null) {
            dmVar.j(charSequence);
            return;
        }
        TextView textView = this.N;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.dz
    public final void o() throws PackageManager.NameNotFoundException {
        String strX;
        this.A = true;
        O(false);
        T();
        Object obj = this.g;
        if (obj instanceof Activity) {
            try {
                strX = clc.x((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strX = null;
            }
            if (strX != null) {
                dm dmVar = this.k;
                if (dmVar == null) {
                    this.aa = true;
                } else {
                    dmVar.f(true);
                }
            }
            synchronized (dz.e) {
                dz.i(this);
                dz.d.add(new WeakReference(this));
            }
        }
        this.C = new Configuration(this.h.getResources().getConfiguration());
        this.T = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return L(str, context, attributeSet);
    }

    @Override // defpackage.dz
    public final void p(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.y && i == 108) {
            return;
        }
        if (this.u && i == 1) {
            this.u = false;
        }
        if (i == 1) {
            W();
            this.y = true;
            return;
        }
        if (i == 2) {
            W();
            this.O = true;
            return;
        }
        if (i == 5) {
            W();
            this.P = true;
            return;
        }
        if (i == 10) {
            W();
            this.w = true;
        } else if (i == 108) {
            W();
            this.u = true;
        } else if (i != 109) {
            this.i.requestFeature(i);
        } else {
            W();
            this.v = true;
        }
    }

    public final int q() {
        int i = this.U;
        return i != -100 ? i : dz.b;
    }

    final Context s() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        dm dmVarB = b();
        Context contextB = dmVarB != null ? dmVarB.b() : null;
        return contextB == null ? this.h : contextB;
    }

    final em t(Menu menu) {
        em[] emVarArr = this.R;
        int length = emVarArr != null ? emVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            em emVar = emVarArr[i];
            if (emVar != null && emVar.h == menu) {
                return emVar;
            }
        }
        return null;
    }

    final Window.Callback u() {
        return this.i.getCallback();
    }

    public final CharSequence v() {
        Object obj = this.g;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.L;
    }

    final void w(int i, em emVar, Menu menu) {
        if (menu == null) {
            menu = emVar.h;
        }
        if (emVar.m && !this.B) {
            eg egVar = this.j;
            Window.Callback callback = this.i.getCallback();
            try {
                egVar.b = true;
                callback.onPanelClosed(i, menu);
            } finally {
                egVar.b = false;
            }
        }
    }

    final void x(gb gbVar) {
        if (this.Q) {
            return;
        }
        this.Q = true;
        this.m.a();
        Window.Callback callbackU = u();
        if (callbackU != null && !this.B) {
            callbackU.onPanelClosed(108, gbVar);
        }
        this.Q = false;
    }

    final void y(em emVar, boolean z) {
        ViewGroup viewGroup;
        iw iwVar;
        if (z && emVar.a == 0 && (iwVar = this.m) != null && iwVar.s()) {
            x(emVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.h.getSystemService("window");
        if (windowManager != null && emVar.m && (viewGroup = emVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                w(emVar.a, emVar, null);
            }
        }
        emVar.k = false;
        emVar.l = false;
        emVar.m = false;
        emVar.f = null;
        emVar.n = true;
        if (this.z == emVar) {
            this.z = null;
        }
        if (emVar.a == 0) {
            E();
        }
    }

    final void z(int i) {
        em emVarM = M(i);
        if (emVarM.h != null) {
            Bundle bundle = new Bundle();
            emVarM.h.o(bundle);
            if (bundle.size() > 0) {
                emVarM.p = bundle;
            }
            emVarM.h.s();
            emVarM.h.clear();
        }
        emVarM.o = true;
        emVarM.n = true;
        if ((i == 108 || i == 0) && this.m != null) {
            em emVarM2 = M(0);
            emVarM2.k = false;
            I(emVarM2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void V(defpackage.em r14, android.view.KeyEvent r15) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.V(em, android.view.KeyEvent):void");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return L(str, context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int r(android.content.Context r21, int r22) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.r(android.content.Context, int):int");
    }
}
