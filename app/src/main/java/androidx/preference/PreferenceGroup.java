package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.aaa;
import defpackage.clc;
import defpackage.daw;
import defpackage.dbi;
import defpackage.mb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PreferenceGroup extends Preference {
    public final aaa a;
    public final List b;
    public int c;
    private final Handler d;
    private boolean e;
    private int f;
    private boolean g;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final void A(boolean z) {
        super.A(z);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).X(z);
        }
    }

    @Override // androidx.preference.Preference
    public final void C() {
        super.G();
        this.g = true;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).C();
        }
    }

    @Override // androidx.preference.Preference
    public final void E() {
        super.Q();
        this.g = false;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).E();
        }
    }

    public final void ab(int i) {
        if (i != Integer.MAX_VALUE && !T()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.c = i;
    }

    public boolean ac() {
        return true;
    }

    public boolean ad(Preference preference) {
        boolean zRemove;
        synchronized (this) {
            preference.Q();
            if (preference.C == this) {
                preference.x(null);
            }
            zRemove = this.b.remove(preference);
            if (zRemove) {
                String str = preference.r;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.dz()));
                    Handler handler = this.d;
                    Runnable runnable = this.h;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (this.g) {
                    preference.E();
                }
            }
        }
        B();
        return zRemove;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ae(androidx.preference.Preference r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.b
            boolean r1 = r0.contains(r6)
            if (r1 != 0) goto L9e
            java.lang.String r1 = r6.r
            if (r1 == 0) goto L28
            r1 = r5
        Ld:
            androidx.preference.PreferenceGroup r2 = r1.C
            if (r2 == 0) goto L13
            r1 = r2
            goto Ld
        L13:
            java.lang.String r2 = r6.r
            androidx.preference.Preference r1 = r1.l(r2)
            if (r1 == 0) goto L28
            java.lang.String r1 = "Found duplicated key: \""
            java.lang.String r3 = "\". This can cause unintended behaviour, please use unique keys for every preference."
            java.lang.String r1 = defpackage.a.bw(r2, r1, r3)
            java.lang.String r2 = "PreferenceGroup"
            android.util.Log.e(r2, r1)
        L28:
            int r1 = r6.p
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L47
            boolean r1 = r5.e
            if (r1 == 0) goto L3c
            int r1 = r5.f
            int r2 = r1 + 1
            r5.f = r2
            r6.L(r1)
        L3c:
            boolean r1 = r6 instanceof androidx.preference.PreferenceGroup
            if (r1 == 0) goto L47
            r1 = r6
            androidx.preference.PreferenceGroup r1 = (androidx.preference.PreferenceGroup) r1
            boolean r2 = r5.e
            r1.e = r2
        L47:
            int r0 = java.util.Collections.binarySearch(r0, r6)
            if (r0 >= 0) goto L50
            int r0 = -r0
            int r0 = r0 + (-1)
        L50:
            boolean r1 = r5.j()
            r6.X(r1)
            monitor-enter(r5)
            java.util.List r1 = r5.b     // Catch: java.lang.Throwable -> L9b
            r1.add(r0, r6)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            dbe r0 = r5.k
            java.lang.String r1 = r6.r
            if (r1 == 0) goto L7a
            aaa r2 = r5.a
            boolean r3 = r2.containsKey(r1)
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r2.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.remove(r1)
            goto L7e
        L7a:
            long r3 = r0.a()
        L7e:
            r6.l = r3
            r1 = 1
            r6.m = r1
            r1 = 0
            r6.D(r0)     // Catch: java.lang.Throwable -> L97
            r6.m = r1
            r6.x(r5)
            boolean r0 = r5.g
            if (r0 == 0) goto L93
            r6.C()
        L93:
            r5.B()
            return
        L97:
            r5 = move-exception
            r6.m = r1
            throw r5
        L9b:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            throw r6
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.ae(androidx.preference.Preference):void");
    }

    @Override // androidx.preference.Preference
    protected final Parcelable dy() {
        return new daw(super.dy(), this.c);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(daw.class)) {
            super.g(parcelable);
            return;
        }
        daw dawVar = (daw) parcelable;
        this.c = dawVar.a;
        super.g(dawVar.getSuperState());
    }

    public final int k() {
        return this.b.size();
    }

    public final Preference l(CharSequence charSequence) {
        Preference preferenceL;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.r, charSequence)) {
            return this;
        }
        int iK = k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceO = o(i);
            if (TextUtils.equals(preferenceO.r, charSequence)) {
                return preferenceO;
            }
            if ((preferenceO instanceof PreferenceGroup) && (preferenceL = ((PreferenceGroup) preferenceO).l(charSequence)) != null) {
                return preferenceL;
            }
        }
        return null;
    }

    public final Preference o(int i) {
        return (Preference) this.b.get(i);
    }

    @Override // androidx.preference.Preference
    public final void y(Bundle bundle) {
        super.y(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).y(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void z(Bundle bundle) {
        super.z(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            o(i).z(bundle);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new aaa();
        this.d = new Handler(Looper.getMainLooper());
        this.e = true;
        this.f = 0;
        this.g = false;
        this.c = Integer.MAX_VALUE;
        this.h = new mb(this, 14, null);
        this.b = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.i, i, i2);
        this.e = clc.N(typedArrayObtainStyledAttributes, 2, 2, true);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ab(clc.Q(typedArrayObtainStyledAttributes, 1, 1));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
