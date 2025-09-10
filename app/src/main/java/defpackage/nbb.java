package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbb extends PopupWindow implements AdapterView.OnItemClickListener {
    private static final Duration s = Duration.ofMillis(100);
    private static final Duration t = Duration.ofMillis(200);
    private int A;
    private int B;
    private final mgr C;
    public final Context a;
    public final View b;
    public final nbc c;
    public TextView d;
    public ImageButton e;
    public nba f;
    public final View.OnLayoutChangeListener g;
    public final int h;
    public final int i;
    public int j;
    public mxm k;
    public int l;
    public int m;
    public int n;
    public int o;
    public View p;
    public final mwq q;
    public AmbientMode.AmbientController r;
    private final Handler u;
    private ListView v;
    private final mxj w;
    private final int x;
    private final int y;
    private final int z;

    public nbb(Context context, mgr mgrVar, View view, nbc nbcVar, int i, mwq mwqVar) {
        super(context);
        this.w = mxj.PHONE_LAYOUT;
        this.g = new fjt(this, 12, null);
        this.k = mxm.PORTRAIT;
        this.a = context;
        this.C = mgrVar;
        this.u = new Handler(context.getMainLooper());
        this.b = view;
        this.c = nbcVar;
        this.q = mwqVar;
        this.h = context.getResources().getDimensionPixelSize(R.dimen.menu_background_radius);
        this.x = context.getResources().getDimensionPixelSize(R.dimen.menu_horizontal_margin);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.menu_arrow_base);
        this.y = context.getResources().getDimensionPixelSize(R.dimen.menu_arrow_height);
        this.z = context.getResources().getDimensionPixelSize(R.dimen.menu_max_height);
        this.A = 80;
        this.j = i;
        this.B = R.color.menu_bg_color;
    }

    public static final int i(View view, boolean z) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[!z ? 1 : 0];
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int k() {
        /*
            r5 = this;
            mxj r0 = r5.w
            mxj r1 = defpackage.mxj.JARVIS_LAYOUT
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            int r0 = r5.getWidth()
            int r0 = -r0
            int r5 = r5.n
            int r0 = r0 - r5
            return r0
        L13:
            mxm r0 = r5.k
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            if (r0 == 0) goto L6a
            r3 = 1
            r4 = 48
            if (r0 == r3) goto L53
            if (r0 == r2) goto L3d
            if (r0 != r1) goto L27
            goto L6a
        L27:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            mxm r5 = r5.k
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Unexpected orientation: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L3d:
            int r0 = r5.A
            if (r0 != r4) goto L50
            int r0 = r5.getWidth()
            int r0 = -r0
            android.view.View r1 = r5.b
            int r1 = r1.getMeasuredHeight()
            int r0 = r0 - r1
            int r1 = r5.n
            goto L68
        L50:
            int r0 = r5.n
            goto L93
        L53:
            int r0 = r5.A
            if (r0 != r4) goto L61
            android.view.View r0 = r5.b
            int r0 = r0.getMeasuredHeight()
            int r1 = r5.n
            int r0 = r0 + r1
            goto L93
        L61:
            int r0 = r5.getWidth()
            int r0 = -r0
            int r1 = r5.n
        L68:
            int r0 = r0 - r1
            goto L93
        L6a:
            int r0 = r5.j
            if (r0 != r1) goto L71
            int r0 = r5.x
            goto L93
        L71:
            r1 = 5
            if (r0 != r1) goto L83
            int r0 = r5.getWidth()
            int r0 = -r0
            android.view.View r1 = r5.b
            int r1 = r1.getMeasuredWidth()
            int r0 = r0 + r1
            int r1 = r5.x
            goto L68
        L83:
            android.view.View r0 = r5.b
            int r0 = r0.getMeasuredWidth()
            int r0 = r0 / r2
            int r1 = r5.getHeight()
            int r1 = r1 / r2
            int r2 = r5.o
            int r0 = r0 + r1
            int r0 = r0 + r2
        L93:
            android.view.View r1 = r5.b
            float r2 = r1.getRotation()
            int r2 = java.lang.Math.round(r2)
            mxm r5 = r5.k
            mxm r3 = defpackage.mxm.REVERSE_LANDSCAPE
            r4 = 0
            if (r5 != r3) goto Lb0
            r5 = -90
            if (r2 == r5) goto Lac
            r5 = 270(0x10e, float:3.78E-43)
            if (r2 != r5) goto Lb0
        Lac:
            int r4 = r1.getMeasuredHeight()
        Lb0:
            int r0 = r0 + r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbb.k():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int l() {
        /*
            r5 = this;
            mxj r0 = r5.w
            mxj r1 = defpackage.mxj.JARVIS_LAYOUT
            boolean r0 = r0.equals(r1)
            r1 = 2
            if (r0 == 0) goto L18
            int r0 = r5.getHeight()
            int r0 = r0 / r1
            android.view.View r5 = r5.b
            int r5 = r5.getMeasuredHeight()
            int r0 = r0 + r5
            return r0
        L18:
            mxm r0 = r5.k
            int r0 = r0.ordinal()
            if (r0 == 0) goto L91
            r2 = 1
            r3 = 5
            r4 = 3
            if (r0 == r2) goto L68
            if (r0 == r1) goto L40
            if (r0 != r4) goto L2a
            goto L91
        L2a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            mxm r5 = r5.k
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Unexpected orientation: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L40:
            int r0 = r5.j
            if (r0 != r4) goto L47
            int r0 = r5.x
            goto La9
        L47:
            if (r0 != r3) goto L58
            int r0 = r5.getHeight()
            int r0 = -r0
            android.view.View r1 = r5.b
            int r1 = r1.getMeasuredWidth()
            int r0 = r0 + r1
            int r1 = r5.x
            goto La8
        L58:
            android.view.View r0 = r5.b
            int r0 = r0.getMeasuredWidth()
            int r0 = r0 / r1
            int r2 = r5.getHeight()
            int r2 = r2 / r1
            int r1 = r5.o
            int r0 = r0 + r2
            goto L9f
        L68:
            int r0 = r5.j
            if (r0 != r4) goto L74
            int r0 = r5.getHeight()
            int r0 = -r0
            int r1 = r5.x
            goto La8
        L74:
            if (r0 != r3) goto L80
            android.view.View r0 = r5.b
            int r0 = r0.getMeasuredWidth()
            int r0 = -r0
            int r1 = r5.x
            goto L9f
        L80:
            android.view.View r0 = r5.b
            int r0 = r0.getMeasuredWidth()
            int r0 = -r0
            int r0 = r0 / r1
            int r2 = r5.getHeight()
            int r2 = r2 / r1
            int r1 = r5.o
            int r0 = r0 - r2
            goto La8
        L91:
            int r0 = r5.A
            r1 = 48
            if (r0 != r1) goto La1
            android.view.View r0 = r5.b
            int r0 = r0.getMeasuredHeight()
            int r1 = r5.n
        L9f:
            int r0 = r0 + r1
            goto La9
        La1:
            int r0 = r5.getHeight()
            int r0 = -r0
            int r1 = r5.n
        La8:
            int r0 = r0 - r1
        La9:
            android.view.View r1 = r5.b
            float r2 = r1.getRotation()
            int r2 = java.lang.Math.round(r2)
            mxm r5 = r5.k
            mxm r3 = defpackage.mxm.LANDSCAPE
            r4 = 0
            if (r5 != r3) goto Lc6
            r5 = 90
            if (r2 == r5) goto Lc2
            r5 = -270(0xfffffffffffffef2, float:NaN)
            if (r2 != r5) goto Lc6
        Lc2:
            int r4 = r1.getMeasuredWidth()
        Lc6:
            int r0 = r0 + r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbb.l():int");
    }

    private final void m() {
        View contentView = getContentView();
        mgr mgrVar = this.C;
        int i = true != mgrVar.a.isInMultiWindowMode() ? 1540 : 0;
        if (!mgrVar.g(WindowInsets.Type.navigationBars())) {
            i |= 4098;
        }
        if (mgrVar.h()) {
            i |= 16;
        }
        contentView.setSystemUiVisibility(i);
    }

    private final void n(naz nazVar) {
        View contentView = getContentView();
        for (naz nazVar2 : naz.values()) {
            View viewFindViewById = contentView.findViewById(nazVar2.e);
            if (nazVar2 == nazVar && viewFindViewById.getVisibility() != 0) {
                viewFindViewById.setVisibility(0);
            } else if (nazVar2 != nazVar && viewFindViewById.getVisibility() != 8) {
                viewFindViewById.setVisibility(8);
            }
        }
        boolean z = nazVar.f;
        int i = z ? 0 : this.y;
        int i2 = z ? this.y : 0;
        setWidth(this.l + i);
        this.m = a();
        setHeight(Math.min(this.m, Math.min(this.b.getRootView().getHeight(), this.z) - this.y) + i2);
        o(nazVar);
        contentView.addOnLayoutChangeListener(this.g);
    }

    private final void o(naz nazVar) {
        ((ImageView) getContentView().findViewById(nazVar.e)).getDrawable().setColorFilter(getContentView().findViewById(R.id.popup_background).getBackground().getColorFilter());
    }

    private final void p() {
        if (isShowing()) {
            n(b());
            update(this.b, k(), l(), -1, -1);
            m();
        }
    }

    public final int a() throws Resources.NotFoundException {
        this.p.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), 0);
        int measuredHeight = this.p.getMeasuredHeight();
        int listPaddingTop = this.v.getListPaddingTop() + this.v.getListPaddingBottom();
        int width = getWidth() - (getContentView().getPaddingLeft() + getContentView().getPaddingRight());
        View view = this.b;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int maxAvailableHeight = getMaxAvailableHeight(view);
        View view2 = null;
        int i = 0;
        while (true) {
            nbc nbcVar = this.c;
            if (i >= nbcVar.getCount()) {
                break;
            }
            view2 = nbcVar.getView(i, view2, this.v);
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-1, -2, 0);
                view2.setLayoutParams(layoutParams);
            }
            view2.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, this.v.getListPaddingLeft() + this.v.getListPaddingRight(), layoutParams.width), layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(maxAvailableHeight, 0));
            view2.forceLayout();
            listPaddingTop += view2.getMeasuredHeight();
            i++;
        }
        TextView textView = this.d;
        return (textView == null || textView.getVisibility() != 0) ? listPaddingTop : measuredHeight + listPaddingTop;
    }

    public final naz b() {
        if (this.w.equals(mxj.JARVIS_LAYOUT)) {
            return naz.RIGHT;
        }
        int iOrdinal = this.k.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return this.A == 48 ? naz.LEFT : naz.RIGHT;
            }
            if (iOrdinal == 2) {
                return this.A == 48 ? naz.RIGHT : naz.LEFT;
            }
            if (iOrdinal != 3) {
                throw new RuntimeException(null, null);
            }
        }
        return this.A == 48 ? naz.TOP : naz.BOTTOM;
    }

    public final void c(Object obj) {
        if (obj == null) {
            return;
        }
        nbc nbcVar = this.c;
        int iA = nbcVar.a(obj);
        boolean z = false;
        if (!nbcVar.c && (nbcVar.b != obj || !nbcVar.d)) {
            z = true;
        }
        this.v.setItemChecked(iA, z);
        nbcVar.b = obj;
        out.a();
        nbcVar.notifyDataSetChanged();
        nba nbaVar = this.f;
        if (nbaVar != null) {
            nbaVar.a(obj);
        }
    }

    public final void d() throws Resources.NotFoundException {
        if (this.p != null) {
            return;
        }
        Context context = this.a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.menu_width);
        this.l = dimensionPixelSize;
        setWidth(dimensionPixelSize);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setFocusable(true);
        setAttachedInDecor(false);
        setClippingEnabled(false);
        setOverlapAnchor(true);
        View viewInflate = View.inflate(context, R.layout.popup_menu, null);
        this.p = viewInflate;
        setContentView(viewInflate);
        ListView listView = (ListView) this.p.findViewById(R.id.popup_list);
        this.v = listView;
        nbc nbcVar = this.c;
        listView.setAdapter((ListAdapter) nbcVar);
        this.v.setOnItemClickListener(this);
        this.m = a();
        c(nbcVar.b);
    }

    public final void e(int i) {
        this.B = i;
        getContentView().findViewById(R.id.popup_background).getBackground().setColorFilter(new PorterDuffColorFilter(this.a.getResources().getColor(this.w.equals(mxj.JARVIS_LAYOUT) ? R.color.menu_bg_color_jarvis : this.B, null), PorterDuff.Mode.SRC_IN));
        o(b());
    }

    public final void f(Object obj) {
        nbc nbcVar = this.c;
        if (obj != nbcVar.b || nbcVar.d) {
            c(obj);
        }
    }

    public final void g() {
        getContentView().addOnLayoutChangeListener(this.g);
        n(b());
        showAsDropDown(this.b, k(), l(), 0);
        m();
        TextView textView = this.d;
        if (textView != null) {
            nbc nbcVar = this.c;
            if (nbcVar.b != null) {
                mwq mwqVar = this.q;
                Context context = this.a;
                CharSequence text = textView.getText();
                Object obj = nbcVar.b;
                if (obj == null) {
                    throw new IllegalStateException("No item has been selected.");
                }
                mwqVar.h(context.getString(R.string.menu_open_announce, text, ((nbe) nbcVar.a.get(nbcVar.a(obj))).b));
            }
        }
        update();
    }

    public final void h(mxm mxmVar) {
        this.k = mxmVar;
        p();
    }

    public final void j(int i) {
        this.A = 80;
        this.j = i;
        p();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        nbe item = this.c.getItem(i);
        AmbientMode.AmbientController ambientController = this.r;
        if (ambientController != null && item.a == ltg.MARS_STORE && !item.j) {
            ((myl) ambientController.a).f();
        }
        if (!item.j) {
            this.v.clearChoices();
            return;
        }
        f(item.a);
        syj.f(this.a);
        if (item.k) {
            this.u.postDelayed(new mzq(this, item, 2), t.toMillis());
        }
        this.u.postDelayed(new mub(this, 17), s.toMillis());
    }
}
