package com.google.android.apps.camera.ui.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import defpackage.dal;
import defpackage.dbh;
import defpackage.ink;
import defpackage.lud;
import defpackage.luj;
import defpackage.luk;
import defpackage.nbl;
import defpackage.ujp;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ManagedSwitchPreferenceCompat extends SwitchPreferenceCompat implements dal {
    public Function c;
    public dal d;
    public luk e;
    public luj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedSwitchPreferenceCompat(Context context) {
        super(context);
        context.getClass();
        this.d = new dal() { // from class: nbk
            @Override // defpackage.dal
            public final boolean b(Preference preference, Object obj) {
                return true;
            }
        };
        Object applicationContext = this.j.getApplicationContext();
        applicationContext.getClass();
        ((nbl) ((ink) applicationContext).d(nbl.class)).x(this);
        Z();
        lud ludVarA = lud.a(this.r);
        if (ludVarA != null) {
            this.w = ae().b(ludVarA);
        } else {
            this.w = Boolean.valueOf(ad().k(null));
        }
        this.n = this;
    }

    @Override // androidx.preference.Preference
    protected final boolean S(boolean z) {
        return ad().k(this.r);
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void a(dbh dbhVar) {
        dbhVar.getClass();
        super.a(dbhVar);
        TextView textView = (TextView) dbhVar.B(R.id.summary);
        if (textView != null) {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
    }

    public final luk ad() {
        luk lukVar = this.e;
        if (lukVar != null) {
            return lukVar;
        }
        ujp.c("settingsManager");
        return null;
    }

    public final luj ae() {
        luj lujVar = this.f;
        if (lujVar != null) {
            return lujVar;
        }
        ujp.c("settingsReader");
        return null;
    }

    @Override // defpackage.dal
    public final boolean b(Preference preference, Object obj) {
        boolean zB = this.d.b(preference, obj);
        if (zB) {
            luk lukVarAd = ad();
            String str = this.r;
            obj.getClass();
            lukVarAd.j(str, ((Boolean) obj).booleanValue());
        }
        return zB;
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    protected final void c() {
        Function function = this.c;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedSwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.d = new dal() { // from class: nbk
            @Override // defpackage.dal
            public final boolean b(Preference preference, Object obj) {
                return true;
            }
        };
        Object applicationContext = this.j.getApplicationContext();
        applicationContext.getClass();
        ((nbl) ((ink) applicationContext).d(nbl.class)).x(this);
        Z();
        lud ludVarA = lud.a(this.r);
        if (ludVarA != null) {
            this.w = ae().b(ludVarA);
        } else {
            this.w = Boolean.valueOf(ad().k(null));
        }
        this.n = this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedSwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.d = new dal() { // from class: nbk
            @Override // defpackage.dal
            public final boolean b(Preference preference, Object obj) {
                return true;
            }
        };
        Object applicationContext = this.j.getApplicationContext();
        applicationContext.getClass();
        ((nbl) ((ink) applicationContext).d(nbl.class)).x(this);
        Z();
        lud ludVarA = lud.a(this.r);
        if (ludVarA != null) {
            this.w = ae().b(ludVarA);
        } else {
            this.w = Boolean.valueOf(ad().k(null));
        }
        this.n = this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedSwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.d = new dal() { // from class: nbk
            @Override // defpackage.dal
            public final boolean b(Preference preference, Object obj) {
                return true;
            }
        };
        Object applicationContext = this.j.getApplicationContext();
        applicationContext.getClass();
        ((nbl) ((ink) applicationContext).d(nbl.class)).x(this);
        Z();
        lud ludVarA = lud.a(this.r);
        if (ludVarA != null) {
            this.w = ae().b(ludVarA);
        } else {
            this.w = Boolean.valueOf(ad().k(null));
        }
        this.n = this;
    }
}
