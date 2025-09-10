package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class daz extends ki {
    public List d;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Runnable i = new mb(this, 15, null);
    private final Handler h = new Handler(Looper.getMainLooper());

    public daz(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.E = this;
        this.f = new ArrayList();
        this.d = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            k(((PreferenceScreen) preferenceGroup).d);
        } else {
            k(true);
        }
        r();
    }

    private final List s(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iK = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            Preference preferenceO = preferenceGroup.o(i2);
            if (preferenceO.x) {
                if (!u(preferenceGroup) || i < preferenceGroup.c) {
                    arrayList.add(preferenceO);
                } else {
                    arrayList2.add(preferenceO);
                }
                if (preferenceO instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                    if (!preferenceGroup2.ac()) {
                        continue;
                    } else {
                        if (u(preferenceGroup) && u(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : s(preferenceGroup2)) {
                            if (!u(preferenceGroup) || i < preferenceGroup.c) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (u(preferenceGroup) && i > preferenceGroup.c) {
            dad dadVar = new dad(preferenceGroup.j, arrayList2, preferenceGroup.dz());
            dadVar.o = new dax(this, preferenceGroup);
            arrayList.add(dadVar);
        }
        return arrayList;
    }

    private final void t(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int iK = preferenceGroup.k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceO = preferenceGroup.o(i);
            list.add(preferenceO);
            day dayVar = new day(preferenceO);
            List list2 = this.g;
            if (!list2.contains(dayVar)) {
                list2.add(dayVar);
            }
            if (preferenceO instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                if (preferenceGroup2.ac()) {
                    t(list, preferenceGroup2);
                }
            }
            preferenceO.E = this;
        }
    }

    private static final boolean u(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    @Override // defpackage.ki
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.ki
    public final int b(int i) {
        day dayVar = new day(o(i));
        List list = this.g;
        int iIndexOf = list.indexOf(dayVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = list.size();
        list.add(dayVar);
        return size;
    }

    @Override // defpackage.ki
    public final long c(int i) {
        if (this.b) {
            return o(i).dz();
        }
        return -1L;
    }

    @Override // defpackage.ki
    public final /* bridge */ /* synthetic */ lg d(ViewGroup viewGroup, int i) {
        day dayVar = (day) this.g.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, dbi.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = byi.bJ(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(dayVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = dayVar.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new dbh(viewInflate);
    }

    public final Preference o(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (Preference) this.d.get(i);
    }

    @Override // defpackage.ki
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void i(dbh dbhVar, int i) {
        View view = dbhVar.a;
        Preference preferenceO = o(i);
        Drawable background = view.getBackground();
        Drawable drawable = dbhVar.s;
        if (background != drawable) {
            view.setBackground(drawable);
        }
        TextView textView = (TextView) dbhVar.B(R.id.title);
        if (textView != null && dbhVar.t != null && !textView.getTextColors().equals(dbhVar.t)) {
            textView.setTextColor(dbhVar.t);
        }
        preferenceO.a(dbhVar);
    }

    public void q(Preference preference) {
        Handler handler = this.h;
        Runnable runnable = this.i;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    public final void r() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).E = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        PreferenceGroup preferenceGroup = this.e;
        t(arrayList, preferenceGroup);
        this.d = s(preferenceGroup);
        dbe dbeVar = preferenceGroup.k;
        e();
        for (Preference preference : this.f) {
        }
    }
}
