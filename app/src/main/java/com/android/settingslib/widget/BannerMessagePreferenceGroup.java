package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.dlz;
import defpackage.eoj;
import defpackage.eos;
import defpackage.gx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BannerMessagePreferenceGroup extends PreferenceGroup implements eoj {
    private final String F;
    private final String G;
    private final Drawable H;
    private boolean d;
    private NumberButtonPreference e;
    private SectionButtonPreference f;
    private final List g;
    private final String h;
    private final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerMessagePreferenceGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        context.getClass();
        this.g = new ArrayList();
        Z();
        this.A = R.layout.settingslib_banner_message_preference_group;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eos.b, 0, 0);
        this.h = typedArrayObtainStyledAttributes.getString(3);
        this.i = typedArrayObtainStyledAttributes.getString(4);
        this.F = typedArrayObtainStyledAttributes.getString(1);
        this.G = typedArrayObtainStyledAttributes.getString(2);
        this.H = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void ag() {
        List list = this.g;
        int size = list.size();
        for (int i = 1; i < size; i++) {
            ((BannerMessagePreference) list.get(i)).O(this.d);
        }
    }

    private final void ah() {
        NumberButtonPreference numberButtonPreference = this.e;
        if (numberButtonPreference != null) {
            numberButtonPreference.O(!this.d);
        }
        SectionButtonPreference sectionButtonPreference = this.f;
        if (sectionButtonPreference != null) {
            sectionButtonPreference.O(this.d);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        dbhVar.getClass();
        super.a(dbhVar);
        if (this.g.size() >= 2) {
            if (this.e == null) {
                Context context = this.j;
                context.getClass();
                NumberButtonPreference numberButtonPreference = new NumberButtonPreference(context, null, 14);
                numberButtonPreference.K(this.h);
                numberButtonPreference.N(this.i);
                numberButtonPreference.b = r5.size() - 1;
                numberButtonPreference.d();
                numberButtonPreference.d();
                numberButtonPreference.a = new gx(this, 4, null);
                this.e = numberButtonPreference;
                super.ae(numberButtonPreference);
            }
            if (this.f == null) {
                Context context2 = this.j;
                context2.getClass();
                SectionButtonPreference sectionButtonPreference = new SectionButtonPreference(context2, null, 14);
                sectionButtonPreference.K(this.F);
                sectionButtonPreference.N(this.G);
                sectionButtonPreference.J(this.H);
                sectionButtonPreference.a = new dlz(this, 15);
                sectionButtonPreference.d();
                this.f = sectionButtonPreference;
                super.ae(sectionButtonPreference);
            }
        }
        ah();
        ag();
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean ad(Preference preference) {
        preference.getClass();
        if (!(preference instanceof BannerMessagePreference)) {
            return false;
        }
        this.g.remove(preference);
        return super.ad(preference);
    }

    @Override // androidx.preference.PreferenceGroup
    public final void ae(Preference preference) {
        preference.getClass();
        if (preference instanceof BannerMessagePreference) {
            List list = this.g;
            if (list.size() < 3) {
                list.add(preference);
                super.ae(preference);
            }
        }
    }

    public final void af() {
        this.d = !this.d;
        ah();
        ag();
    }
}
