package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class grq implements grx, gru {
    private static final sgv a = sgv.g("grq");
    private final rwc b;
    private final String c;
    private final String d;
    private final jod e;
    private final iso f;

    public grq(jod jodVar, iso isoVar, rwc rwcVar, String str, String str2) {
        this.e = jodVar;
        this.f = isoVar;
        this.b = rwcVar;
        this.c = str;
        this.d = str2;
    }

    private static void c(List list, String str, int i, String str2) {
        if (rnt.V(str2)) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", str);
        contentValues.put("data1", str2);
        contentValues.put("data2", Integer.valueOf(i));
        list.add(contentValues);
    }

    private static void d(Intent intent, String str, String str2) {
        rnt.M(!rnt.V(str), "Must have valid field name");
        if (rnt.V(str2)) {
            return;
        }
        intent.putExtra(str, str2);
    }

    @Override // defpackage.grx
    public final void b() {
        String str = this.c;
        Intent intentA = a();
        this.f.t(String.format(this.d, str));
        this.e.d(intentA);
    }

    @Override // defpackage.gru
    public final Intent a() {
        rwc rwcVar = this.b;
        boolean zH = rwcVar.h();
        String str = clFzVRcygwbq.hcKzFCjBYBYnc;
        if (!zH || ((gsc) rwcVar.c()).b.isEmpty()) {
            ((sgt) a.c().M(1017)).s("No contact object present in ResultInfo. Defaulting to sending limited information with Intent. This should not happen");
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.putExtra(str, this.c);
            return intent;
        }
        Intent intent2 = new Intent("android.intent.action.INSERT");
        intent2.setType("vnd.android.cursor.dir/contact");
        Object objC = rwcVar.c();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        gsc gscVar = (gsc) objC;
        Iterator it = gscVar.c.iterator();
        while (it.hasNext()) {
            c(arrayList, "vnd.android.cursor.item/email_v2", 2, (String) it.next());
        }
        Iterator it2 = gscVar.d.iterator();
        while (it2.hasNext()) {
            c(arrayList, "vnd.android.cursor.item/phone_v2", 3, (String) it2.next());
        }
        if (!gscVar.f.isEmpty()) {
            c(arrayList, "vnd.android.cursor.item/website", 5, gscVar.f);
        }
        if (!gscVar.e.isEmpty()) {
            c(arrayList, "vnd.android.cursor.item/postal-address_v2", 2, gscVar.e);
        }
        if (!gscVar.h.isEmpty()) {
            c(arrayList, "vnd.android.cursor.item/organization", 1, gscVar.h);
        }
        if (!arrayList.isEmpty()) {
            intent2.putParcelableArrayListExtra(HHdu.FpSFUKHiCw, arrayList);
        }
        d(intent2, str, ((gsc) rwcVar.c()).b);
        d(intent2, "notes", ((gsc) rwcVar.c()).g);
        return intent2;
    }
}
