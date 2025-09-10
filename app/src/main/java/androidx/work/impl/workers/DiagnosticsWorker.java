package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import defpackage.cgh;
import defpackage.cpn;
import defpackage.cwy;
import defpackage.dco;
import defpackage.dcu;
import defpackage.dvv;
import defpackage.dvx;
import defpackage.dwh;
import defpackage.dwj;
import defpackage.dyj;
import defpackage.ebh;
import defpackage.ebo;
import defpackage.ebx;
import defpackage.eby;
import defpackage.ecr;
import defpackage.ecs;
import defpackage.ecy;
import defpackage.edt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final cpn b() throws Throwable {
        dcu dcuVar;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        int iA10;
        int iA11;
        ebh ebhVar;
        ebo eboVar;
        ecs ecsVar;
        dyj dyjVarA = dyj.a(this.a);
        WorkDatabase workDatabase = dyjVarA.d;
        workDatabase.getClass();
        eby ebyVarB = workDatabase.B();
        ebo eboVarZ = workDatabase.z();
        ecs ecsVarC = workDatabase.C();
        ebh ebhVarY = workDatabase.y();
        cpn cpnVar = dyjVarA.c.g;
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        dcu dcuVarA = dcu.a("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        dcuVarA.e(1, jCurrentTimeMillis);
        dco dcoVar = ((ecr) ebyVarB).a;
        dcoVar.k();
        Cursor cursorF = cwy.f(dcoVar, dcuVarA);
        try {
            iA = cgh.A(cursorF, "id");
            iA2 = cgh.A(cursorF, "state");
            iA3 = cgh.A(cursorF, "worker_class_name");
            iA4 = cgh.A(cursorF, "input_merger_class_name");
            iA5 = cgh.A(cursorF, "input");
            iA6 = cgh.A(cursorF, "output");
            iA7 = cgh.A(cursorF, "initial_delay");
            iA8 = cgh.A(cursorF, "interval_duration");
            iA9 = cgh.A(cursorF, "flex_duration");
            iA10 = cgh.A(cursorF, "run_attempt_count");
            iA11 = cgh.A(cursorF, "backoff_policy");
            dcuVar = dcuVarA;
        } catch (Throwable th) {
            th = th;
            dcuVar = dcuVarA;
        }
        try {
            int iA12 = cgh.A(cursorF, "backoff_delay_duration");
            int iA13 = cgh.A(cursorF, "last_enqueue_time");
            int iA14 = cgh.A(cursorF, "minimum_retention_duration");
            int iA15 = cgh.A(cursorF, "schedule_requested_at");
            int iA16 = cgh.A(cursorF, "run_in_foreground");
            int iA17 = cgh.A(cursorF, "out_of_quota_policy");
            int iA18 = cgh.A(cursorF, "period_count");
            int iA19 = cgh.A(cursorF, "generation");
            int iA20 = cgh.A(cursorF, "next_schedule_time_override");
            int iA21 = cgh.A(cursorF, "next_schedule_time_override_generation");
            int iA22 = cgh.A(cursorF, "stop_reason");
            int iA23 = cgh.A(cursorF, "trace_tag");
            int iA24 = cgh.A(cursorF, "backoff_on_system_interruptions");
            int iA25 = cgh.A(cursorF, "required_network_type");
            int iA26 = cgh.A(cursorF, "required_network_request");
            int iA27 = cgh.A(cursorF, "requires_charging");
            int iA28 = cgh.A(cursorF, "requires_device_idle");
            int iA29 = cgh.A(cursorF, "requires_battery_not_low");
            int iA30 = cgh.A(cursorF, "requires_storage_not_low");
            int iA31 = cgh.A(cursorF, HHdu.ymyOxXiSnvYcWs);
            int iA32 = cgh.A(cursorF, "trigger_max_content_delay");
            int iA33 = cgh.A(cursorF, "content_uri_triggers");
            int i = iA14;
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                String string = cursorF.getString(iA);
                int iY = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.y(cursorF.getInt(iA2));
                String string2 = cursorF.getString(iA3);
                String string3 = cursorF.getString(iA4);
                dvx dvxVarA = dvx.a(cursorF.getBlob(iA5));
                dvx dvxVarA2 = dvx.a(cursorF.getBlob(iA6));
                long j = cursorF.getLong(iA7);
                long j2 = cursorF.getLong(iA8);
                long j3 = cursorF.getLong(iA9);
                int i2 = cursorF.getInt(iA10);
                int iV = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.v(cursorF.getInt(iA11));
                long j4 = cursorF.getLong(iA12);
                long j5 = cursorF.getLong(iA13);
                int i3 = i;
                long j6 = cursorF.getLong(i3);
                int i4 = iA;
                int i5 = iA15;
                long j7 = cursorF.getLong(i5);
                iA15 = i5;
                int i6 = iA16;
                boolean z = cursorF.getInt(i6) != 0;
                iA16 = i6;
                int i7 = iA17;
                int iX = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.x(cursorF.getInt(i7));
                iA17 = i7;
                int i8 = iA18;
                int i9 = cursorF.getInt(i8);
                iA18 = i8;
                int i10 = iA19;
                int i11 = cursorF.getInt(i10);
                iA19 = i10;
                int i12 = iA20;
                long j8 = cursorF.getLong(i12);
                iA20 = i12;
                int i13 = iA21;
                int i14 = cursorF.getInt(i13);
                iA21 = i13;
                int i15 = iA22;
                int i16 = cursorF.getInt(i15);
                iA22 = i15;
                int i17 = iA23;
                Boolean boolValueOf = null;
                String string4 = cursorF.isNull(i17) ? null : cursorF.getString(i17);
                iA23 = i17;
                int i18 = iA24;
                Integer numValueOf = cursorF.isNull(i18) ? null : Integer.valueOf(cursorF.getInt(i18));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                iA24 = i18;
                int i19 = iA25;
                Boolean bool = boolValueOf;
                int iW = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.w(cursorF.getInt(i19));
                iA25 = i19;
                int i20 = iA26;
                ecy ecyVarN = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.n(cursorF.getBlob(i20));
                iA26 = i20;
                int i21 = iA27;
                boolean z2 = cursorF.getInt(i21) != 0;
                iA27 = i21;
                int i22 = iA28;
                boolean z3 = cursorF.getInt(i22) != 0;
                iA28 = i22;
                int i23 = iA29;
                boolean z4 = cursorF.getInt(i23) != 0;
                iA29 = i23;
                int i24 = iA30;
                boolean z5 = cursorF.getInt(i24) != 0;
                iA30 = i24;
                int i25 = iA31;
                long j9 = cursorF.getLong(i25);
                iA31 = i25;
                int i26 = iA32;
                long j10 = cursorF.getLong(i26);
                iA32 = i26;
                int i27 = iA33;
                iA33 = i27;
                arrayList.add(new ebx(string, iY, string2, string3, dvxVarA, dvxVarA2, j, j2, j3, new dvv(ecyVarN, iW, z2, z3, z4, z5, j9, j10, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.o(cursorF.getBlob(i27))), i2, iV, j4, j5, j6, j7, z, iX, i9, i11, j8, i14, i16, string4, bool));
                iA = i4;
                i = i3;
            }
            cursorF.close();
            dcuVar.j();
            List listB = ebyVarB.b();
            List listJ = ebyVarB.j();
            if (arrayList.isEmpty()) {
                ebhVar = ebhVarY;
                eboVar = eboVarZ;
                ecsVar = ecsVarC;
            } else {
                dwj.b();
                int i28 = edt.a;
                dwj.b();
                ebhVar = ebhVarY;
                eboVar = eboVarZ;
                ecsVar = ecsVarC;
                edt.a(eboVar, ecsVar, ebhVar, arrayList);
            }
            if (!listB.isEmpty()) {
                dwj.b();
                int i29 = edt.a;
                dwj.b();
                edt.a(eboVar, ecsVar, ebhVar, listB);
            }
            if (!listJ.isEmpty()) {
                dwj.b();
                int i30 = edt.a;
                dwj.b();
                edt.a(eboVar, ecsVar, ebhVar, listJ);
            }
            return new dwh();
        } catch (Throwable th2) {
            th = th2;
            cursorF.close();
            dcuVar.j();
            throw th;
        }
    }
}
