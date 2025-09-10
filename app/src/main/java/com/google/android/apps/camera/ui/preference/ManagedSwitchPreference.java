package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.preference.Preference;
import android.preference.SwitchPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import com.google.ar.core.R;
import defpackage.ink;
import defpackage.ipd;
import defpackage.lud;
import defpackage.luj;
import defpackage.luk;
import defpackage.mlk;
import defpackage.nbf;
import defpackage.nbj;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ManagedSwitchPreference extends SwitchPreference implements Preference.OnPreferenceChangeListener, nbf {
    public static final /* synthetic */ int j = 0;
    public luk a;
    public Preference.OnPreferenceChangeListener b;
    public Runnable c;
    public String d;
    public String e;
    public View f;
    public Function g;
    public View.OnClickListener h;
    public luj i;
    private boolean k;
    private Button l;
    private Switch m;

    public ManagedSwitchPreference(Context context) {
        super(context);
        this.b = new Preference.OnPreferenceChangeListener() { // from class: nbi
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                int i = ManagedSwitchPreference.j;
                return true;
            }
        };
        this.k = true;
        c(context);
    }

    public static final int b(FrameLayout frameLayout) {
        return frameLayout.getVisibility() == 0 ? R.drawable.quantum_gm_ic_expand_less_gm_grey_24 : R.drawable.quantum_gm_ic_expand_more_gm_grey_24;
    }

    private final void c(Context context) {
        ((nbj) ((ink) context.getApplicationContext()).d(nbj.class)).w(this);
        setPersistent(false);
        lud ludVarA = lud.a(getKey());
        if (ludVarA != null) {
            setDefaultValue(this.i.b(ludVarA));
        } else {
            setDefaultValue(Boolean.valueOf(this.a.k(getKey())));
        }
        super.setOnPreferenceChangeListener(this);
    }

    @Override // defpackage.nbf
    public final void a(Function function) {
        this.g = function;
    }

    @Override // android.preference.Preference
    public final Preference.OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return this.b;
    }

    @Override // android.preference.Preference
    public final boolean getPersistedBoolean(boolean z) {
        return this.a.k(getKey());
    }

    @Override // android.preference.SwitchPreference, android.preference.Preference
    protected final void onBindView(View view) {
        View viewFindViewById;
        super.onBindView(view);
        Switch r0 = (Switch) view.findViewById(android.R.id.switch_widget);
        this.m = r0;
        if (r0 != null) {
            if (this.k) {
                r0.setVisibility(0);
            } else {
                r0.setVisibility(8);
            }
        }
        Button button = (Button) view.findViewById(R.id.action_button);
        this.l = button;
        int i = 12;
        if (button != null) {
            String str = this.d;
            if (str == null || this.c == null) {
                button.setVisibility(8);
            } else {
                button.setText(str);
                this.l.setOnClickListener(new mlk(this, i));
            }
        }
        if (this.e != null && this.f != null) {
            Button button2 = (Button) view.findViewById(R.id.expand_button);
            ImageView imageView = (ImageView) view.findViewById(R.id.expand_icon);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.expand_button_layout);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.collapsible_layout);
            if (button2 != null && imageView != null && linearLayout != null && frameLayout != null) {
                button2.setText(this.e);
                button2.setOnClickListener(new ipd(frameLayout, imageView, i));
                imageView.setImageResource(b(frameLayout));
                linearLayout.setContentDescription(this.e);
                linearLayout.setOnClickListener(new mlk(button2, 13));
                frameLayout.removeAllViews();
                frameLayout.addView(this.f);
            }
        }
        if (this.h == null || (viewFindViewById = view.findViewById(R.id.helper_button)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(this.h);
        viewFindViewById.setContentDescription(getContext().getString(R.string.learn_more_about_setting, getTitle()));
    }

    @Override // android.preference.TwoStatePreference, android.preference.Preference
    protected final void onClick() {
        Function function = this.g;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.onClick();
        }
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.a.j(getKey(), ((Boolean) obj).booleanValue());
        return this.b.onPreferenceChange(preference, obj);
    }

    @Override // android.preference.Preference
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.k = z;
    }

    @Override // android.preference.Preference
    public final void setOnPreferenceChangeListener(Preference.OnPreferenceChangeListener onPreferenceChangeListener) {
        this.b = onPreferenceChangeListener;
    }

    public ManagedSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Preference.OnPreferenceChangeListener() { // from class: nbi
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                int i = ManagedSwitchPreference.j;
                return true;
            }
        };
        this.k = true;
        c(context);
    }

    public ManagedSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Preference.OnPreferenceChangeListener() { // from class: nbi
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                int i2 = ManagedSwitchPreference.j;
                return true;
            }
        };
        this.k = true;
        c(context);
    }
}
