package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.preference.TwoStatePreference;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.eoj;
import defpackage.eom;
import defpackage.eoq;
import defpackage.ipd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainSwitchPreference extends TwoStatePreference implements eom, eoj {
    private final List c;

    public MainSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.c = new ArrayList();
        this.A = true != eoq.a(context) ? R.layout.settingslib_main_switch_layout : R.layout.settingslib_expressive_main_switch_layout;
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        dbhVar.u = false;
        dbhVar.v = false;
        MainSwitchBar mainSwitchBar = (MainSwitchBar) dbhVar.a.findViewById(R.id.settingslib_main_switch_bar);
        mainSwitchBar.d(u());
        mainSwitchBar.c(m());
        mainSwitchBar.setOnClickListener(new ipd(this, mainSwitchBar, 1, null));
        mainSwitchBar.a.clear();
        mainSwitchBar.b(((TwoStatePreference) this).a);
        mainSwitchBar.a(this);
        if (this.x) {
            mainSwitchBar.setVisibility(0);
            mainSwitchBar.d.setOnCheckedChangeListener(mainSwitchBar);
        } else if (mainSwitchBar.e()) {
            mainSwitchBar.setVisibility(8);
            mainSwitchBar.d.setOnCheckedChangeListener(null);
        }
    }

    @Override // defpackage.eom
    public final void dD(CompoundButton compoundButton, boolean z) {
        super.k(z);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((eom) it.next()).dD(compoundButton, z);
        }
    }
}
