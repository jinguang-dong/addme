package defpackage;

import android.app.ActionBar;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class eob extends bp {
    private eoc o;

    private final eoc h() {
        if (this.o == null) {
            this.o = new eoc(new AmbientMode.AmbientController(this));
        }
        return this.o;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = super.getTheme();
        if (eoq.a(this)) {
            theme.applyStyle(R.style.Theme_SubSettingsBase_Expressive, true);
        }
        return theme;
    }

    @Override // defpackage.nh, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (eo().a() == 0) {
            finishAfterTransition();
        }
    }

    @Override // defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    protected void onCreate(Bundle bundle) throws Exception {
        int i = 0;
        if (!AmbientMode.AmbientCallback.p(getIntent())) {
            nj.a(this);
            View viewFindViewById = findViewById(android.R.id.content);
            eod eodVar = new eod((nh) this, i);
            int[] iArr = con.a;
            cog.i(viewFindViewById, eodVar);
        }
        super.onCreate(bundle);
        if (eoq.a(this)) {
            setTheme(R.style.Theme_SubSettingsBase_Expressive);
        }
        eoc eocVarH = h();
        LayoutInflater layoutInflater = getLayoutInflater();
        boolean z = eocVarH.e;
        boolean zA = eoq.a(this);
        eocVarH.f = zA;
        View viewInflate = layoutInflater.inflate(true != zA ? R.layout.collapsing_toolbar_base_layout : R.layout.settingslib_expressive_collapsing_toolbar_base_layout, (ViewGroup) null, false);
        if (viewInflate instanceof CoordinatorLayout) {
        }
        eocVarH.a = (CollapsingToolbarLayout) viewInflate.findViewById(R.id.collapsing_toolbar);
        eocVarH.b = (AppBarLayout) viewInflate.findViewById(R.id.app_bar);
        CollapsingToolbarLayout collapsingToolbarLayout = eocVarH.a;
        AppBarLayout appBarLayout = eocVarH.b;
        if (collapsingToolbarLayout != null) {
            rla rlaVar = collapsingToolbarLayout.a;
            rlaVar.s = 1.1f;
            rlaVar.t = 3;
            AmbientMode.AmbientCallback ambientCallback = new AmbientMode.AmbientCallback((char[]) null);
            if (rlaVar.w != ambientCallback) {
                rlaVar.w = ambientCallback;
                rlaVar.g(true);
            }
        }
        if (appBarLayout != null) {
            clf clfVar = (clf) appBarLayout.getLayoutParams();
            AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
            ((AppBarLayout.BaseBehavior) behavior).b = new rkf(null);
            clfVar.b(behavior);
        }
        eocVarH.d = (FrameLayout) viewInflate.findViewById(R.id.content_frame);
        eocVarH.c = (Toolbar) viewInflate.findViewById(R.id.action_bar);
        AmbientMode.AmbientController ambientController = eocVarH.g;
        Toolbar toolbar = eocVarH.c;
        bp bpVar = (bp) ambientController.a;
        super.setActionBar(toolbar);
        ActionBar actionBar = super.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            if (eocVarH.f) {
                actionBar.setHomeAsUpIndicator(R.drawable.settingslib_expressive_icon_back);
            }
            actionBar.setDisplayShowTitleEnabled(true);
        }
        super.setContentView(viewInflate);
        if (AmbientMode.AmbientCallback.p(getIntent())) {
            findViewById(R.id.content_parent).setFitsSystemWindows(false);
        }
    }

    @Override // android.app.Activity
    public boolean onNavigateUp() {
        if (eo().a() > 0) {
            eo().ab();
        }
        if (eo().a() != 0) {
            return true;
        }
        finishAfterTransition();
        return true;
    }

    @Override // defpackage.nh, android.app.Activity
    public final void setContentView(int i) {
        eoc eocVar = this.o;
        ViewGroup viewGroup = eocVar == null ? (ViewGroup) findViewById(R.id.content_frame) : eocVar.d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        LayoutInflater.from(this).inflate(i, viewGroup);
    }

    @Override // android.app.Activity
    public final void setTitle(int i) {
        setTitle(getText(i));
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        eoc eocVarH = h();
        CollapsingToolbarLayout collapsingToolbarLayout = eocVarH.a;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.g(charSequence);
        }
        super.setTitle(charSequence);
    }

    @Override // defpackage.nh, android.app.Activity
    public final void setContentView(View view) {
        eoc eocVar = this.o;
        ViewGroup viewGroup = eocVar == null ? (ViewGroup) findViewById(R.id.content_frame) : eocVar.d;
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    @Override // defpackage.nh, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        eoc eocVar = this.o;
        ViewGroup viewGroup = eocVar == null ? (ViewGroup) findViewById(R.id.content_frame) : eocVar.d;
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
    }
}
