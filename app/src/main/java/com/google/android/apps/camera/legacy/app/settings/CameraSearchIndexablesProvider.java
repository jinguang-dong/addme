package com.google.android.apps.camera.legacy.app.settings;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.preference.Preference;
import android.provider.SearchIndexablesContract;
import android.provider.SearchIndexablesProvider;
import android.view.accessibility.AccessibilityManager;
import com.google.ar.core.R;
import defpackage.hbj;
import defpackage.izm;
import defpackage.jak;
import defpackage.jdh;
import defpackage.luj;
import defpackage.owq;
import defpackage.pfl;
import defpackage.pkc;
import defpackage.ryf;
import defpackage.ryg;
import defpackage.sfd;
import defpackage.sgt;
import defpackage.sgv;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CameraSearchIndexablesProvider extends SearchIndexablesProvider {
    private static final sgv a = sgv.g("com.google.android.apps.camera.legacy.app.settings.CameraSearchIndexablesProvider");
    private jdh b;
    private boolean c = false;

    private final synchronized jdh a() {
        boolean z = this.c;
        boolean zIsTouchExplorationEnabled = ((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled();
        this.c = zIsTouchExplorationEnabled;
        if (this.b == null || z != zIsTouchExplorationEnabled) {
            izm izmVar = ((jak) getContext().getApplicationContext()).g().a;
            pkc pkcVar = (pkc) izmVar.im.a();
            hbj hbjVar = (hbj) izmVar.o.a();
            pfl pflVar = (pfl) izmVar.we.a();
            luj lujVar = (luj) izmVar.eZ.a();
            luj lujVar2 = (luj) izmVar.eZ.a();
            AccessibilityManager accessibilityManagerI = izmVar.i();
            owq owqVar = (owq) izmVar.uI.a();
            sfd sfdVar = sfd.a;
            jdh jdhVar = new jdh(pkcVar, hbjVar, pflVar, lujVar, lujVar2, accessibilityManagerI, owqVar, sfdVar, sfdVar, sfdVar);
            this.b = jdhVar;
            jdhVar.b(getContext());
        }
        return this.b;
    }

    private final String b() {
        return getContext().getApplicationInfo().packageName;
    }

    private final Object[] c(String str, String str2, String str3) {
        Object[] objArr = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
        objArr[12] = str3;
        objArr[1] = str;
        objArr[2] = str2;
        objArr[8] = Integer.valueOf(R.drawable.ic_camera);
        objArr[9] = "com.android.settings.action.EXTRA_SETTINGS";
        objArr[10] = b();
        objArr[11] = CameraSettingsActivity.class.getName();
        return objArr;
    }

    public final boolean onCreate() {
        ((sgt) a.c().M(2673)).s("Called onCreate");
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public final Cursor queryNonIndexableKeys(String[] strArr) {
        ((sgt) a.c().M(2674)).s("Called queryNonIndexableKeys");
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
        for (String str : a().f) {
            Object[] objArr = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
            objArr[0] = str;
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    public final Cursor queryRawData(String[] strArr) {
        ((sgt) a.c().M(2676)).s("Called queryRawData");
        String string = getContext().getString(R.string.app_name);
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
        matrixCursor.addRow(c(string, getContext().getString(R.string.mode_settings), "camera_settings"));
        ryg rygVar = (ryg) a().m;
        Collection<Preference> ryfVar = rygVar.c;
        if (ryfVar == null) {
            ryfVar = new ryf(rygVar);
            rygVar.c = ryfVar;
        }
        for (Preference preference : ryfVar) {
            preference.getTitle();
            preference.getSummary();
            preference.getKey();
            matrixCursor.addRow(c(preference.getTitle().toString(), preference.getSummary().toString(), preference.getKey()));
        }
        return matrixCursor;
    }

    public final Cursor queryXmlResources(String[] strArr) {
        ((sgt) a.c().M(2678)).s("Called queryXmlResources");
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS);
        Object[] objArr = new Object[SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS.length];
        objArr[0] = 1;
        objArr[1] = Integer.valueOf(R.xml.camera_preferences);
        objArr[2] = null;
        objArr[3] = 0;
        objArr[4] = "android.intent.action.MAIN";
        objArr[5] = b();
        objArr[6] = CameraSettingsActivity.class.getName();
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }
}
