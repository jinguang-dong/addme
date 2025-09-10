package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import com.google.ar.core.R;
import defpackage.byi;
import defpackage.clc;
import defpackage.dak;
import defpackage.dal;
import defpackage.dam;
import defpackage.dan;
import defpackage.dao;
import defpackage.daz;
import defpackage.dbd;
import defpackage.dbe;
import defpackage.dbi;
import defpackage.gx;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Preference implements Comparable {
    public int A;
    public int B;
    public PreferenceGroup C;
    public dao D;
    public daz E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private List K;
    private boolean L;
    private dan M;
    private final View.OnClickListener N;
    private CharSequence a;
    private int b;
    private Drawable c;
    private Bundle d;
    private boolean e;
    private boolean f;
    private String g;
    private boolean h;
    private boolean i;
    public final Context j;
    public dbe k;
    public long l;
    public boolean m;
    public dal n;
    public dam o;
    public int p;
    public CharSequence q;
    public String r;
    public Intent s;
    public String t;
    public boolean u;
    public boolean v;
    public Object w;
    public boolean x;
    public boolean y;
    public boolean z;

    public Preference(Context context) {
        this(context, null);
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void A(boolean z) {
        List list = this.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).W(z);
        }
    }

    protected final void B() {
        daz dazVar = this.E;
        if (dazVar != null) {
            dazVar.q(this);
        }
    }

    public void C() {
        G();
    }

    public final void D(dbe dbeVar) {
        this.k = dbeVar;
        if (!this.m) {
            this.l = dbeVar.a();
        }
        if (V()) {
            dbe dbeVar2 = this.k;
            if ((dbeVar2 != null ? dbeVar2.d() : null).contains(this.r)) {
                h(null);
                return;
            }
        }
        Object obj = this.w;
        if (obj != null) {
            h(obj);
        }
    }

    public void E() {
        Q();
    }

    public final void F() {
        Intent intent;
        dbd dbdVar;
        if (U() && this.u) {
            c();
            dam damVar = this.o;
            if (damVar != null) {
                damVar.a(this);
                return;
            }
            dbe dbeVar = this.k;
            if ((dbeVar == null || (dbdVar = dbeVar.c) == null || !dbdVar.C(this)) && (intent = this.s) != null) {
                this.j.startActivity(intent);
            }
        }
    }

    public final void G() {
        if (TextUtils.isEmpty(this.g)) {
            return;
        }
        Preference preferenceT = t(this.g);
        if (preferenceT != null) {
            if (preferenceT.K == null) {
                preferenceT.K = new ArrayList();
            }
            preferenceT.K.add(this);
            W(preferenceT.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.g + "\" not found for preference \"" + this.r + "\" (title: \"" + ((Object) this.q) + "\"");
    }

    public final void H(boolean z) {
        if (this.e != z) {
            this.e = z;
            A(j());
            d();
        }
    }

    public final void I(int i) {
        J(byi.bJ(this.j, i));
        this.b = i;
    }

    public void J(Drawable drawable) {
        if (this.c != drawable) {
            this.c = drawable;
            this.b = 0;
            d();
        }
    }

    public final void K(String str) {
        this.r = str;
        if (!this.f || T()) {
            return;
        }
        if (TextUtils.isEmpty(this.r)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f = true;
    }

    public final void L(int i) {
        if (i != this.p) {
            this.p = i;
            B();
        }
    }

    public final void M(dao daoVar) {
        this.D = daoVar;
        d();
    }

    public final void N(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.q)) {
            return;
        }
        this.q = charSequence;
        d();
    }

    public final void O(boolean z) {
        if (this.x != z) {
            this.x = z;
            daz dazVar = this.E;
            if (dazVar != null) {
                dazVar.q(this);
            }
        }
    }

    public final void P(SharedPreferences.Editor editor) {
        if (this.k.a) {
            return;
        }
        editor.apply();
    }

    public final void Q() {
        Preference preferenceT;
        List list;
        String str = this.g;
        if (str == null || (preferenceT = t(str)) == null || (list = preferenceT.K) == null) {
            return;
        }
        list.remove(this);
    }

    public final boolean R(Object obj) {
        dal dalVar = this.n;
        return dalVar == null || dalVar.b(this, obj);
    }

    protected boolean S(boolean z) {
        return !V() ? z : this.k.d().getBoolean(this.r, z);
    }

    public final boolean T() {
        return !TextUtils.isEmpty(this.r);
    }

    public boolean U() {
        return this.e && this.h && this.i;
    }

    protected final boolean V() {
        return this.k != null && this.v && T();
    }

    public final void W(boolean z) {
        if (this.h == z) {
            this.h = !z;
            A(j());
            d();
        }
    }

    public final void X(boolean z) {
        if (this.i == z) {
            this.i = !z;
            A(j());
            d();
        }
    }

    protected void Y(String str) {
        if (V() && !TextUtils.equals(str, v(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putString(this.r, str);
            P(editorB);
        }
    }

    public final void Z() {
        this.v = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.dbh r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.a(dbh):void");
    }

    public final void aa() {
        if (this.u) {
            this.u = false;
            d();
        }
    }

    protected void c() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.p;
        int i2 = preference.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.q.toString());
    }

    protected void d() {
        int iIndexOf;
        daz dazVar = this.E;
        if (dazVar == null || (iIndexOf = dazVar.d.indexOf(this)) == -1) {
            return;
        }
        dazVar.g(iIndexOf, this);
    }

    protected Parcelable dy() {
        this.L = true;
        return dak.EMPTY_STATE;
    }

    public long dz() {
        return this.l;
    }

    public void eW(View view) {
        F();
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    protected void g(Parcelable parcelable) {
        this.L = true;
        if (parcelable != dak.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    protected void h(Object obj) {
    }

    public boolean j() {
        return !U();
    }

    public CharSequence m() {
        dao daoVar = this.D;
        return daoVar != null ? daoVar.a(this) : this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.D != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    protected final float p(float f) {
        return !V() ? f : this.k.d().getFloat(this.r, f);
    }

    protected final int q(int i) {
        return !V() ? i : this.k.d().getInt(this.r, i);
    }

    public final Drawable r() {
        int i;
        if (this.c == null && (i = this.b) != 0) {
            this.c = byi.bJ(this.j, i);
        }
        return this.c;
    }

    public final Bundle s() {
        if (this.d == null) {
            this.d = new Bundle();
        }
        return this.d;
    }

    protected final Preference t(String str) {
        dbe dbeVar = this.k;
        if (dbeVar == null) {
            return null;
        }
        return dbeVar.e(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceU = u();
        if (!TextUtils.isEmpty(charSequenceU)) {
            sb.append(charSequenceU);
            sb.append(' ');
        }
        CharSequence charSequenceM = m();
        if (!TextUtils.isEmpty(charSequenceM)) {
            sb.append(charSequenceM);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public CharSequence u() {
        return this.q;
    }

    protected String v(String str) {
        return !V() ? str : this.k.d().getString(this.r, str);
    }

    public final Set w(Set set) {
        return !V() ? set : this.k.d().getStringSet(this.r, set);
    }

    final void x(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.C != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.C = preferenceGroup;
    }

    public void z(Bundle bundle) {
        if (T()) {
            this.L = false;
            Parcelable parcelableDy = dy();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableDy != null) {
                bundle.putParcelable(this.r, parcelableDy);
            }
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, clc.H(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public void y(Bundle bundle) {
        Parcelable parcelable;
        if (T() && (parcelable = bundle.getParcelable(this.r)) != null) {
            this.L = false;
            g(parcelable);
            if (!this.L) {
                throw new IllegalStateException(IQwwK.GJBdGN);
            }
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = Integer.MAX_VALUE;
        this.e = true;
        this.u = true;
        this.v = true;
        this.h = true;
        this.i = true;
        this.x = true;
        this.F = true;
        this.G = true;
        this.y = true;
        this.J = true;
        this.A = R.layout.preference;
        this.N = new gx(this, 3);
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.g, i, i2);
        this.b = clc.J(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.r = clc.M(typedArrayObtainStyledAttributes, 26, 6);
        this.q = clc.L(typedArrayObtainStyledAttributes, 34, 4);
        this.a = clc.L(typedArrayObtainStyledAttributes, 33, 7);
        this.p = clc.Q(typedArrayObtainStyledAttributes, 28, 8);
        this.t = clc.M(typedArrayObtainStyledAttributes, 22, 13);
        this.A = clc.J(typedArrayObtainStyledAttributes, 27, 3, R.layout.preference);
        this.B = clc.J(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.e = clc.N(typedArrayObtainStyledAttributes, 21, 2, true);
        this.u = clc.N(typedArrayObtainStyledAttributes, 30, 5, true);
        this.v = clc.N(typedArrayObtainStyledAttributes, 29, 1, true);
        this.g = clc.M(typedArrayObtainStyledAttributes, 19, 10);
        this.F = clc.N(typedArrayObtainStyledAttributes, 16, 16, this.u);
        this.G = clc.N(typedArrayObtainStyledAttributes, 17, 17, this.u);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.w = f(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.w = f(typedArrayObtainStyledAttributes, 11);
        }
        this.J = clc.N(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.H = zHasValue;
        if (zHasValue) {
            this.y = clc.N(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.I = clc.N(typedArrayObtainStyledAttributes, 24, 15, false);
        this.x = clc.N(typedArrayObtainStyledAttributes, 25, 25, true);
        this.z = clc.N(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
