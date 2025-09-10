package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.ar.core.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rby extends bm {
    public ArrayAdapter a;
    public LicenseMenuActivity b;

    @Override // defpackage.bm
    public final void onAttach(Context context) {
        super.onAttach(context);
        bp activity = getActivity();
        if (activity instanceof LicenseMenuActivity) {
            this.b = (LicenseMenuActivity) activity;
        }
    }

    @Override // defpackage.bm
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.bm
    public final void onDetach() {
        super.onDetach();
        this.b = null;
    }

    @Override // defpackage.bm
    public final void onViewCreated(View view, Bundle bundle) {
        bp activity = getActivity();
        this.a = new ArrayAdapter(activity, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        cyc cycVarA = cyc.a(activity);
        cyg cygVar = cycVarA.b;
        if (cygVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(HHdu.XlbyH);
        }
        cyd cydVarB = cygVar.b();
        if (cyc.b(2)) {
            Objects.toString(cycVarA);
        }
        if (cydVarB == null) {
            try {
                cygVar.c = true;
                cyi cyiVar = new cyi(getActivity());
                if (cyiVar.getClass().isMemberClass() && !Modifier.isStatic(cyiVar.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cyiVar);
                }
                cyd cydVar = new cyd(cyiVar);
                if (cyc.b(3)) {
                    cydVar.toString();
                }
                cygVar.b.f(54321, cydVar);
                cygVar.a();
                cydVar.l(cycVarA.a, this);
            } catch (Throwable th) {
                cycVarA.b.a();
                throw th;
            }
        } else {
            if (cyc.b(3)) {
                Objects.toString(cydVarB);
            }
            cydVarB.l(cycVarA.a, this);
        }
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.a);
        listView.setOnItemClickListener(new rbx(this, 0));
    }

    @Override // defpackage.bm
    public final void onDestroy() {
        super.onDestroy();
        cyc cycVarA = cyc.a(getActivity());
        cyg cygVar = cycVarA.b;
        if (!cygVar.c) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (cyc.b(2)) {
                    Objects.toString(cycVarA);
                }
                cyd cydVarB = cygVar.b();
                if (cydVarB != null) {
                    cydVarB.k();
                    aab aabVar = cygVar.b;
                    int iA = aae.a(aabVar.b, aabVar.d, 54321);
                    if (iA >= 0) {
                        Object[] objArr = aabVar.c;
                        Object obj = objArr[iA];
                        Object obj2 = aac.a;
                        if (obj != obj2) {
                            objArr[iA] = obj2;
                            aabVar.a = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException(yoGAhrpjU.aHQMnXWWxL);
    }
}
