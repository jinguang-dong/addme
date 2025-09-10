package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import com.google.ar.core.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eop extends daz {
    private final PreferenceGroup e;
    private ArrayList f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final Handler l;
    private final Runnable m;

    public eop(PreferenceGroup preferenceGroup) throws Resources.NotFoundException {
        super(preferenceGroup);
        this.e = preferenceGroup;
        this.f = new ArrayList();
        this.l = new Handler(Looper.getMainLooper());
        this.m = new dzd(this, 10);
        Context context = preferenceGroup.j;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.settingslib_expressive_space_small1);
        this.g = dimensionPixelSize;
        this.h = dimensionPixelSize + dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.settingslib_expressive_space_small1);
        this.i = dimensionPixelSize2;
        this.j = dimensionPixelSize2 + dimensionPixelSize2;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        this.k = typedValue.resourceId;
        s();
    }

    @Override // defpackage.daz, defpackage.ki
    public final /* bridge */ /* synthetic */ void i(lg lgVar, int i) {
        i((dbh) lgVar, i);
    }

    @Override // defpackage.daz
    /* renamed from: p */
    public final void i(dbh dbhVar, int i) {
        int i2;
        dbhVar.getClass();
        super.i(dbhVar, i);
        View view = dbhVar.a;
        Context context = view.getContext();
        context.getClass();
        if (eoq.a(context)) {
            i2 = 0;
            if (i >= 0 && i < this.f.size()) {
                Object obj = this.f.get(i);
                obj.getClass();
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue & 1) != 0) {
                    int i3 = iIntValue & 4;
                    int i4 = iIntValue & 2;
                    i2 = (i4 == 0 || i3 != 0) ? (i3 == 0 || i4 != 0) ? i4 != 0 ? R.drawable.settingslib_round_background : R.drawable.settingslib_round_background_center : R.drawable.settingslib_round_background_bottom : R.drawable.settingslib_round_background_top;
                }
            }
        } else {
            i2 = this.k;
        }
        if (eoq.a(context)) {
            view.setPaddingRelative(i2 == 0 ? this.g : this.h, view.getPaddingTop(), i2 == 0 ? this.i : this.j, view.getPaddingBottom());
        }
        view.setBackgroundResource(i2);
    }

    @Override // defpackage.daz
    public final void q(Preference preference) {
        super.q(preference);
        Handler handler = this.l;
        Runnable runnable = this.m;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s() {
        PreferenceGroup preferenceGroup;
        ArrayList arrayList = new ArrayList(this.f);
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        arrayList2.clear();
        int iA = a();
        ArrayList arrayList3 = new ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            arrayList3.add(0);
        }
        PreferenceGroup preferenceGroup2 = this.e;
        arrayList2.addAll(arrayList3);
        int iA2 = a();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < iA2; i4++) {
            Preference preferenceO = o(i4);
            if (preferenceO instanceof eoj) {
                arrayList2.set(i4, 0);
                i2 = -1;
                i3 = -1;
            } else if (preferenceO instanceof PreferenceCategory) {
                arrayList2.set(i4, 0);
                i2 = -1;
                i3 = -1;
                preferenceGroup2 = (PreferenceGroup) preferenceO;
            } else {
                if ((preferenceO instanceof eoi) && ((eoi) preferenceO).a()) {
                    preferenceGroup = preferenceO instanceof PreferenceGroup ? (PreferenceGroup) preferenceO : null;
                    arrayList2.set(i4, Integer.valueOf(((Number) arrayList2.get(i4)).intValue() | 3));
                    i2 = i4;
                    i3 = -1;
                } else {
                    preferenceGroup = preferenceO != 0 ? preferenceO.C : null;
                    arrayList2.set(i4, Integer.valueOf(((Number) arrayList2.get(i4)).intValue() | 1));
                    if (preferenceGroup == preferenceGroup2) {
                        if (i2 == -1) {
                            arrayList2.set(i4, Integer.valueOf(((Number) arrayList2.get(i4)).intValue() | 2));
                            i2 = i4;
                        }
                        if (i3 == -1 || i3 < i4) {
                            if (i3 != -1) {
                                arrayList2.set(i3, Integer.valueOf(((Number) arrayList2.get(i3)).intValue() & (-5)));
                            }
                            arrayList2.set(i4, Integer.valueOf(((Number) arrayList2.get(i4)).intValue() | 4));
                            i3 = i4;
                        }
                    } else {
                        arrayList2.set(i4, Integer.valueOf(((Number) arrayList2.get(i4)).intValue() | 2));
                        arrayList2.set(i4, Integer.valueOf(((Number) arrayList2.get(i4)).intValue() | 4));
                        i2 = i4;
                        i3 = i2;
                    }
                }
                preferenceGroup2 = preferenceGroup;
            }
        }
        if (a.ao(this.f, arrayList)) {
            return;
        }
        e();
    }
}
