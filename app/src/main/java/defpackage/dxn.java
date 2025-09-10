package defpackage;

import android.database.Cursor;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.work.impl.WorkDatabase;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxn {
    public static final /* synthetic */ int a = 0;

    static {
        dwj.a("Schedulers");
    }

    public static void a(dvs dvsVar, WorkDatabase workDatabase, List list) {
        dcu dcuVar;
        Boolean boolValueOf;
        if (list == null || list.size() == 0) {
            return;
        }
        eby ebyVarB = workDatabase.B();
        workDatabase.l();
        try {
            dcu dcuVarA = dcu.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
            dco dcoVar = ((ecr) ebyVarB).a;
            dcoVar.k();
            Cursor cursorF = cwy.f(dcoVar, dcuVarA);
            try {
                int iA = cgh.A(cursorF, "id");
                int iA2 = cgh.A(cursorF, "state");
                int iA3 = cgh.A(cursorF, "worker_class_name");
                int iA4 = cgh.A(cursorF, "input_merger_class_name");
                int iA5 = cgh.A(cursorF, "input");
                int iA6 = cgh.A(cursorF, "output");
                int iA7 = cgh.A(cursorF, "initial_delay");
                int iA8 = cgh.A(cursorF, "interval_duration");
                int iA9 = cgh.A(cursorF, "flex_duration");
                int iA10 = cgh.A(cursorF, "run_attempt_count");
                int iA11 = cgh.A(cursorF, "backoff_policy");
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
                int iA27 = cgh.A(cursorF, SHXc.nXx);
                int iA28 = cgh.A(cursorF, "requires_device_idle");
                int iA29 = cgh.A(cursorF, "requires_battery_not_low");
                int iA30 = cgh.A(cursorF, "requires_storage_not_low");
                int iA31 = cgh.A(cursorF, "trigger_content_update_delay");
                int iA32 = cgh.A(cursorF, "trigger_max_content_delay");
                int iA33 = cgh.A(cursorF, "content_uri_triggers");
                int i = iA19;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (true) {
                    Boolean boolValueOf2 = null;
                    if (!cursorF.moveToNext()) {
                        break;
                    }
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
                    int i3 = iA14;
                    long j6 = cursorF.getLong(i3);
                    int i4 = iA5;
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
                    int i10 = i;
                    int i11 = cursorF.getInt(i10);
                    i = i10;
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
                    String string4 = cursorF.isNull(i17) ? null : cursorF.getString(i17);
                    iA23 = i17;
                    int i18 = iA24;
                    Integer numValueOf = cursorF.isNull(i18) ? null : Integer.valueOf(cursorF.getInt(i18));
                    if (numValueOf != null) {
                        boolValueOf2 = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    iA24 = i18;
                    int i19 = iA25;
                    Boolean bool = boolValueOf2;
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
                    iA5 = i4;
                    iA14 = i3;
                }
                cursorF.close();
                dcuVarA.j();
                cpn cpnVar = dvsVar.g;
                b(ebyVarB, arrayList);
                int i28 = dvsVar.e;
                dcu dcuVarA2 = dcu.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
                dcuVarA2.e(1, 20L);
                dco dcoVar2 = ((ecr) ebyVarB).a;
                dcoVar2.k();
                Cursor cursorF2 = cwy.f(dcoVar2, dcuVarA2);
                try {
                    int iA34 = cgh.A(cursorF2, "id");
                    int iA35 = cgh.A(cursorF2, "state");
                    int iA36 = cgh.A(cursorF2, "worker_class_name");
                    int iA37 = cgh.A(cursorF2, "input_merger_class_name");
                    int iA38 = cgh.A(cursorF2, "input");
                    int iA39 = cgh.A(cursorF2, "output");
                    int iA40 = cgh.A(cursorF2, "initial_delay");
                    int iA41 = cgh.A(cursorF2, "interval_duration");
                    int iA42 = cgh.A(cursorF2, "flex_duration");
                    int iA43 = cgh.A(cursorF2, "run_attempt_count");
                    int iA44 = cgh.A(cursorF2, "backoff_policy");
                    dcuVar = dcuVarA2;
                    try {
                        int iA45 = cgh.A(cursorF2, "backoff_delay_duration");
                        int iA46 = cgh.A(cursorF2, "last_enqueue_time");
                        int iA47 = cgh.A(cursorF2, "minimum_retention_duration");
                        int iA48 = cgh.A(cursorF2, "schedule_requested_at");
                        int iA49 = cgh.A(cursorF2, "run_in_foreground");
                        int iA50 = cgh.A(cursorF2, "out_of_quota_policy");
                        int iA51 = cgh.A(cursorF2, "period_count");
                        int iA52 = cgh.A(cursorF2, "generation");
                        int iA53 = cgh.A(cursorF2, "next_schedule_time_override");
                        int iA54 = cgh.A(cursorF2, "next_schedule_time_override_generation");
                        int iA55 = cgh.A(cursorF2, "stop_reason");
                        int iA56 = cgh.A(cursorF2, "trace_tag");
                        int iA57 = cgh.A(cursorF2, "backoff_on_system_interruptions");
                        int iA58 = cgh.A(cursorF2, "required_network_type");
                        int iA59 = cgh.A(cursorF2, "required_network_request");
                        int iA60 = cgh.A(cursorF2, "requires_charging");
                        int iA61 = cgh.A(cursorF2, "requires_device_idle");
                        int iA62 = cgh.A(cursorF2, "requires_battery_not_low");
                        int iA63 = cgh.A(cursorF2, TOnSyMaYeslEl.ATIUaSzLXw);
                        int iA64 = cgh.A(cursorF2, "trigger_content_update_delay");
                        int iA65 = cgh.A(cursorF2, "trigger_max_content_delay");
                        int iA66 = cgh.A(cursorF2, "content_uri_triggers");
                        int i29 = iA47;
                        ArrayList arrayList2 = new ArrayList(cursorF2.getCount());
                        while (cursorF2.moveToNext()) {
                            String string5 = cursorF2.getString(iA34);
                            int iY2 = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.y(cursorF2.getInt(iA35));
                            String string6 = cursorF2.getString(iA36);
                            String string7 = cursorF2.getString(iA37);
                            dvx dvxVarA3 = dvx.a(cursorF2.getBlob(iA38));
                            dvx dvxVarA4 = dvx.a(cursorF2.getBlob(iA39));
                            long j11 = cursorF2.getLong(iA40);
                            long j12 = cursorF2.getLong(iA41);
                            long j13 = cursorF2.getLong(iA42);
                            int i30 = cursorF2.getInt(iA43);
                            int iV2 = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.v(cursorF2.getInt(iA44));
                            long j14 = cursorF2.getLong(iA45);
                            long j15 = cursorF2.getLong(iA46);
                            int i31 = i29;
                            long j16 = cursorF2.getLong(i31);
                            i29 = i31;
                            int i32 = iA48;
                            long j17 = cursorF2.getLong(i32);
                            iA48 = i32;
                            int i33 = iA49;
                            boolean z6 = cursorF2.getInt(i33) != 0;
                            iA49 = i33;
                            int i34 = iA50;
                            int iX2 = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.x(cursorF2.getInt(i34));
                            iA50 = i34;
                            int i35 = iA51;
                            int i36 = cursorF2.getInt(i35);
                            iA51 = i35;
                            int i37 = iA52;
                            int i38 = cursorF2.getInt(i37);
                            iA52 = i37;
                            int i39 = iA53;
                            long j18 = cursorF2.getLong(i39);
                            iA53 = i39;
                            int i40 = iA54;
                            int i41 = cursorF2.getInt(i40);
                            iA54 = i40;
                            int i42 = iA55;
                            int i43 = cursorF2.getInt(i42);
                            iA55 = i42;
                            int i44 = iA56;
                            String string8 = cursorF2.isNull(i44) ? null : cursorF2.getString(i44);
                            iA56 = i44;
                            int i45 = iA57;
                            Integer numValueOf2 = cursorF2.isNull(i45) ? null : Integer.valueOf(cursorF2.getInt(i45));
                            if (numValueOf2 == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                            }
                            iA57 = i45;
                            int i46 = iA58;
                            int iW2 = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.w(cursorF2.getInt(i46));
                            iA58 = i46;
                            int i47 = iA59;
                            ecy ecyVarN2 = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.n(cursorF2.getBlob(i47));
                            iA59 = i47;
                            int i48 = iA60;
                            boolean z7 = cursorF2.getInt(i48) != 0;
                            iA60 = i48;
                            int i49 = iA61;
                            boolean z8 = cursorF2.getInt(i49) != 0;
                            iA61 = i49;
                            int i50 = iA62;
                            boolean z9 = cursorF2.getInt(i50) != 0;
                            iA62 = i50;
                            int i51 = iA63;
                            boolean z10 = cursorF2.getInt(i51) != 0;
                            iA63 = i51;
                            int i52 = iA64;
                            long j19 = cursorF2.getLong(i52);
                            iA64 = i52;
                            int i53 = iA65;
                            long j20 = cursorF2.getLong(i53);
                            iA65 = i53;
                            int i54 = iA66;
                            iA66 = i54;
                            arrayList2.add(new ebx(string5, iY2, string6, string7, dvxVarA3, dvxVarA4, j11, j12, j13, new dvv(ecyVarN2, iW2, z7, z8, z9, z10, j19, j20, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.o(cursorF2.getBlob(i54))), i30, iV2, j14, j15, j16, j17, z6, iX2, i36, i38, j18, i41, i43, string8, boolValueOf));
                        }
                        cursorF2.close();
                        dcuVar.j();
                        cpn cpnVar2 = dvsVar.g;
                        b(ebyVarB, arrayList2);
                        arrayList2.addAll(arrayList);
                        List listJ = ebyVarB.j();
                        workDatabase.p();
                        workDatabase.n();
                        if (arrayList2.size() > 0) {
                            ebx[] ebxVarArr = (ebx[]) arrayList2.toArray(new ebx[arrayList2.size()]);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                dxl dxlVar = (dxl) it.next();
                                if (dxlVar.d()) {
                                    dxlVar.c(ebxVarArr);
                                }
                            }
                        }
                        if (listJ.size() > 0) {
                            ebx[] ebxVarArr2 = (ebx[]) listJ.toArray(new ebx[listJ.size()]);
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                dxl dxlVar2 = (dxl) it2.next();
                                if (!dxlVar2.d()) {
                                    dxlVar2.c(ebxVarArr2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursorF2.close();
                        dcuVar.j();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dcuVar = dcuVarA2;
                }
            } catch (Throwable th3) {
                cursorF.close();
                dcuVarA.j();
                throw th3;
            }
        } catch (Throwable th4) {
            workDatabase.n();
            throw th4;
        }
    }

    private static void b(eby ebyVar, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ebyVar.k(((ebx) it.next()).b, jCurrentTimeMillis);
            }
        }
    }
}
