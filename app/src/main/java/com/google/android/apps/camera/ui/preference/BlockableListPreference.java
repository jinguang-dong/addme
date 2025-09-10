package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.R;
import defpackage.nbf;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BlockableListPreference extends ListPreference implements nbf {
    public View.OnClickListener a;
    private Function b;

    public BlockableListPreference(Context context) {
        super(context);
    }

    @Override // defpackage.nbf
    public final void a(Function function) {
        this.b = function;
    }

    @Override // android.preference.Preference
    protected final void onBindView(View view) {
        View viewFindViewById;
        super.onBindView(view);
        if (this.a == null || (viewFindViewById = view.findViewById(R.id.helper_button)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(this.a);
        viewFindViewById.setContentDescription(getContext().getString(R.string.learn_more_about_setting, getTitle()));
    }

    @Override // android.preference.DialogPreference, android.preference.Preference
    protected final void onClick() {
        Function function = this.b;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.onClick();
        }
    }

    public BlockableListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BlockableListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
