package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dav extends bm implements dbd, dbb, dbc, czz {
    public dbe a;
    public RecyclerView b;
    public boolean c;
    public boolean d;
    private final dar ah = new dar(this);
    private int ai = R.layout.preference_list_fragment;
    public final Handler ag = new daq(this, Looper.getMainLooper());
    private final Runnable aj = new mb(this, 13, null);

    public final void B(Drawable drawable) {
        dar darVar = this.ah;
        if (drawable != null) {
            darVar.b = drawable.getIntrinsicHeight();
        } else {
            darVar.b = 0;
        }
        darVar.a = drawable;
        darVar.d.b.K();
    }

    @Override // defpackage.dbd
    public final boolean C(Preference preference) {
        if (preference.t == null) {
            return false;
        }
        boolean zA = false;
        for (bm bmVar = this; !zA && bmVar != null; bmVar = bmVar.D) {
            if (bmVar instanceof dat) {
                zA = ((dat) bmVar).a();
            }
        }
        if (!zA && (getContext() instanceof dat)) {
            zA = ((dat) getContext()).a();
        }
        if (!zA && (!(getActivity() instanceof dat) || !((dat) getActivity()).a())) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            ch parentFragmentManager = getParentFragmentManager();
            Bundle bundleS = preference.s();
            bt btVarH = parentFragmentManager.h();
            requireActivity().getClassLoader();
            bm bmVarB = btVarH.b(preference.t);
            bmVarB.setArguments(bundleS);
            bmVarB.setTargetFragment(this, 0);
            ai aiVar = new ai(parentFragmentManager);
            aiVar.q(((View) requireView().getParent()).getId(), bmVarB);
            if (!aiVar.k) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            aiVar.j = true;
            aiVar.l = null;
            aiVar.h();
        }
        return true;
    }

    public abstract void D();

    @Override // defpackage.dbc
    public final void E() {
        boolean zA = false;
        for (bm bmVar = this; !zA && bmVar != null; bmVar = bmVar.D) {
            if (bmVar instanceof dau) {
                zA = ((dau) bmVar).a();
            }
        }
        if (!zA && (getContext() instanceof dau)) {
            zA = ((dau) getContext()).a();
        }
        if (zA || !(getActivity() instanceof dau)) {
            return;
        }
        ((dau) getActivity()).a();
    }

    @Override // defpackage.czz
    public final Preference a(CharSequence charSequence) {
        dbe dbeVar = this.a;
        if (dbeVar == null) {
            return null;
        }
        return dbeVar.e(charSequence);
    }

    protected ki c(PreferenceScreen preferenceScreen) {
        throw null;
    }

    public final PreferenceScreen d() {
        dbe dbeVar = this.a;
        if (dbeVar == null) {
            return null;
        }
        return dbeVar.b;
    }

    public final void e() {
        PreferenceScreen preferenceScreenD = d();
        if (preferenceScreenD != null) {
            this.b.ab(c(preferenceScreenD));
            preferenceScreenD.C();
        }
    }

    @Override // defpackage.dbb
    public final void f(Preference preference) {
        bb dajVar;
        boolean zA = false;
        for (bm bmVar = this; !zA && bmVar != null; bmVar = bmVar.D) {
            if (bmVar instanceof das) {
                zA = ((das) bmVar).a();
            }
        }
        if (!zA && (getContext() instanceof das)) {
            zA = ((das) getContext()).a();
        }
        if (zA) {
            return;
        }
        if (!((getActivity() instanceof das) && ((das) getActivity()).a()) && getParentFragmentManager().e("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.r;
                dajVar = new dac();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                dajVar.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.r;
                dajVar = new dag();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                dajVar.setArguments(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ibINv.byfzWJOtPvO);
                }
                String str3 = preference.r;
                dajVar = new daj();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                dajVar.setArguments(bundle3);
            }
            dajVar.setTargetFragment(this, 0);
            dajVar.c(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // defpackage.bm
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        dbe dbeVar = new dbe(requireContext());
        this.a = dbeVar;
        dbeVar.e = this;
        Bundle bundle2 = this.l;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        D();
    }

    @Override // defpackage.bm
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, dbi.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.ai = typedArrayObtainStyledAttributes.getResourceId(0, this.ai);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.ai, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            requireContext();
            recyclerView.ad(new LinearLayoutManager());
            recyclerView.aa(new dbg(recyclerView));
        }
        if (recyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.b = recyclerView;
        dar darVar = this.ah;
        recyclerView.aB(darVar);
        B(drawable);
        if (dimensionPixelSize != -1) {
            darVar.b = dimensionPixelSize;
            darVar.d.b.K();
        }
        darVar.c = z;
        if (this.b.getParent() == null) {
            viewGroup2.addView(this.b);
        }
        this.ag.post(this.aj);
        return viewInflate;
    }

    @Override // defpackage.bm
    public final void onDestroyView() {
        Handler handler = this.ag;
        handler.removeCallbacks(this.aj);
        handler.removeMessages(1);
        if (this.c) {
            this.b.ab(null);
            PreferenceScreen preferenceScreenD = d();
            if (preferenceScreenD != null) {
                preferenceScreenD.E();
            }
        }
        this.b = null;
        super.onDestroyView();
    }

    @Override // defpackage.bm
    public final void onSaveInstanceState(Bundle bundle) {
        PreferenceScreen preferenceScreenD = d();
        if (preferenceScreenD != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenD.z(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.bm
    public final void onStart() {
        super.onStart();
        dbe dbeVar = this.a;
        dbeVar.c = this;
        dbeVar.d = this;
    }

    @Override // defpackage.bm
    public final void onStop() {
        super.onStop();
        dbe dbeVar = this.a;
        dbeVar.c = null;
        dbeVar.d = null;
    }

    @Override // defpackage.bm
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenD;
        if (bundle != null && (bundle2 = bundle.getBundle(PNlJufQ.psrQqRqnwL)) != null && (preferenceScreenD = d()) != null) {
            preferenceScreenD.y(bundle2);
        }
        if (this.c) {
            e();
        }
        this.d = true;
    }
}
