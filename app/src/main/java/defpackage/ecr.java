package defpackage;

import android.database.Cursor;
import androidx.wear.ambient.AmbientLifecycleObserver;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecr implements eby {
    public final dco a;
    public final dcc b;
    public final dca c;
    public final dcv d;
    public final dcv e;
    public final dcv f;
    public final dcv g;
    public final dcv h;
    private final dcv i;
    private final dcv j;
    private final dcv k;
    private final dcv l;
    private final dcv m;
    private final dcv n;
    private final dcv o;

    public ecr(dco dcoVar) {
        this.a = dcoVar;
        this.b = new ech(dcoVar);
        this.c = new ecj(dcoVar);
        this.i = new eck(dcoVar);
        this.j = new ecl(dcoVar);
        this.d = new ecm(dcoVar);
        this.e = new ecn(dcoVar);
        this.k = new eco(dcoVar);
        this.l = new ecp(dcoVar);
        this.f = new ecq(dcoVar);
        this.g = new ebz(dcoVar);
        new eca(dcoVar);
        this.m = new ecb(dcoVar);
        this.n = new ecc(dcoVar);
        this.h = new ecd(dcoVar);
        new ece(dcoVar);
        new ecf(dcoVar);
        this.o = new ecg(dcoVar);
    }

    @Override // defpackage.eby
    public final ebx a(String str) throws Throwable {
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
        int iA12;
        int iA13;
        int iA14;
        dcu dcuVarA = dcu.a("SELECT * FROM workspec WHERE id=?", 1);
        dcuVarA.g(1, str);
        dco dcoVar = this.a;
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
            iA12 = cgh.A(cursorF, "backoff_delay_duration");
            iA13 = cgh.A(cursorF, "last_enqueue_time");
            iA14 = cgh.A(cursorF, "minimum_retention_duration");
            dcuVar = dcuVarA;
        } catch (Throwable th) {
            th = th;
            dcuVar = dcuVarA;
        }
        try {
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
            int iA31 = cgh.A(cursorF, "trigger_content_update_delay");
            int iA32 = cgh.A(cursorF, "trigger_max_content_delay");
            int iA33 = cgh.A(cursorF, "content_uri_triggers");
            ebx ebxVar = null;
            Boolean boolValueOf = null;
            if (cursorF.moveToFirst()) {
                String string = cursorF.getString(iA);
                int iY = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.y(cursorF.getInt(iA2));
                String string2 = cursorF.getString(iA3);
                String string3 = cursorF.getString(iA4);
                dvx dvxVarA = dvx.a(cursorF.getBlob(iA5));
                dvx dvxVarA2 = dvx.a(cursorF.getBlob(iA6));
                long j = cursorF.getLong(iA7);
                long j2 = cursorF.getLong(iA8);
                long j3 = cursorF.getLong(iA9);
                int i = cursorF.getInt(iA10);
                int iV = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.v(cursorF.getInt(iA11));
                long j4 = cursorF.getLong(iA12);
                long j5 = cursorF.getLong(iA13);
                long j6 = cursorF.getLong(iA14);
                long j7 = cursorF.getLong(iA15);
                boolean z = cursorF.getInt(iA16) != 0;
                int iX = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.x(cursorF.getInt(iA17));
                int i2 = cursorF.getInt(iA18);
                int i3 = cursorF.getInt(iA19);
                long j8 = cursorF.getLong(iA20);
                int i4 = cursorF.getInt(iA21);
                int i5 = cursorF.getInt(iA22);
                String string4 = cursorF.isNull(iA23) ? null : cursorF.getString(iA23);
                Integer numValueOf = cursorF.isNull(iA24) ? null : Integer.valueOf(cursorF.getInt(iA24));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                ebxVar = new ebx(string, iY, string2, string3, dvxVarA, dvxVarA2, j, j2, j3, new dvv(AmbientLifecycleObserver.AmbientLifecycleCallback.CC.n(cursorF.getBlob(iA26)), AmbientLifecycleObserver.AmbientLifecycleCallback.CC.w(cursorF.getInt(iA25)), cursorF.getInt(iA27) != 0, cursorF.getInt(iA28) != 0, cursorF.getInt(iA29) != 0, cursorF.getInt(iA30) != 0, cursorF.getLong(iA31), cursorF.getLong(iA32), AmbientLifecycleObserver.AmbientLifecycleCallback.CC.o(cursorF.getBlob(iA33))), i, iV, j4, j5, j6, j7, z, iX, i2, i3, j8, i4, i5, string4, boolValueOf);
            }
            cursorF.close();
            dcuVar.j();
            return ebxVar;
        } catch (Throwable th2) {
            th = th2;
            cursorF.close();
            dcuVar.j();
            throw th;
        }
    }

    @Override // defpackage.eby
    public final void e(String str) {
        dco dcoVar = this.a;
        dcoVar.k();
        dfq dfqVarD = this.i.d();
        dfqVarD.g(1, str);
        try {
            dcoVar.l();
            try {
                dfqVarD.a();
                dcoVar.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.i.f(dfqVarD);
        }
    }

    @Override // defpackage.eby
    public final void f(String str, int i) {
        dco dcoVar = this.a;
        dcoVar.k();
        dfq dfqVarD = this.m.d();
        dfqVarD.g(1, str);
        dfqVarD.e(2, i);
        try {
            dcoVar.l();
            try {
                dfqVarD.a();
                dcoVar.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.m.f(dfqVarD);
        }
    }

    @Override // defpackage.eby
    public final void g(String str, long j) {
        dco dcoVar = this.a;
        dcoVar.k();
        dfq dfqVarD = this.l.d();
        dfqVarD.e(1, j);
        dfqVarD.g(2, str);
        try {
            dcoVar.l();
            try {
                dfqVarD.a();
                dcoVar.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.l.f(dfqVarD);
        }
    }

    @Override // defpackage.eby
    public final void h(String str, dvx dvxVar) {
        dco dcoVar = this.a;
        dcoVar.k();
        dfq dfqVarD = this.k.d();
        dfqVarD.c(1, cij.r(dvxVar));
        dfqVarD.g(2, str);
        try {
            dcoVar.l();
            try {
                dfqVarD.a();
                dcoVar.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.k.f(dfqVarD);
        }
    }

    @Override // defpackage.eby
    public final void i(String str, int i) {
        dco dcoVar = this.a;
        dcoVar.k();
        dfq dfqVarD = this.o.d();
        dfqVarD.e(1, i);
        dfqVarD.g(2, str);
        try {
            dcoVar.l();
            try {
                dfqVarD.a();
                dcoVar.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.o.f(dfqVarD);
        }
    }

    @Override // defpackage.eby
    public final void k(String str, long j) {
        dco dcoVar = this.a;
        dcoVar.k();
        dfq dfqVarD = this.n.d();
        dfqVarD.e(1, j);
        dfqVarD.g(2, str);
        try {
            dcoVar.l();
            try {
                dfqVarD.a();
                dcoVar.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.n.f(dfqVarD);
        }
    }

    @Override // defpackage.eby
    public final int l(String str) {
        dcu dcuVarA = dcu.a("SELECT state FROM workspec WHERE id=?", 1);
        dcuVarA.g(1, str);
        dco dcoVar = this.a;
        dcoVar.k();
        Cursor cursorF = cwy.f(dcoVar, dcuVarA);
        try {
            int iY = 0;
            if (cursorF.moveToFirst()) {
                Integer numValueOf = cursorF.isNull(0) ? null : Integer.valueOf(cursorF.getInt(0));
                if (numValueOf != null) {
                    iY = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.y(numValueOf.intValue());
                }
            }
            return iY;
        } finally {
            cursorF.close();
            dcuVarA.j();
        }
    }

    @Override // defpackage.eby
    public final void m(int i, String str) {
        dco dcoVar = this.a;
        dcoVar.k();
        dfq dfqVarD = this.j.d();
        dfqVarD.e(1, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.u(i));
        dfqVarD.g(2, str);
        try {
            dcoVar.l();
            try {
                dfqVarD.a();
                dcoVar.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.j.f(dfqVarD);
        }
    }

    @Override // defpackage.eby
    public final List b() throws Throwable {
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
        int iA12;
        int iA13;
        int iA14;
        dco dcoVar = this.a;
        dcu dcuVarA = dcu.a(CGlJpiVWrCQOq.yAfMLp, 0);
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
            iA12 = cgh.A(cursorF, "backoff_delay_duration");
            iA13 = cgh.A(cursorF, "last_enqueue_time");
            iA14 = cgh.A(cursorF, "minimum_retention_duration");
            dcuVar = dcuVarA;
        } catch (Throwable th) {
            th = th;
            dcuVar = dcuVarA;
        }
        try {
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
            int iA31 = cgh.A(cursorF, "trigger_content_update_delay");
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
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorF.close();
            dcuVar.j();
            throw th;
        }
    }

    @Override // defpackage.eby
    public final List c() throws Throwable {
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
        int iA12;
        int iA13;
        int iA14;
        dco dcoVar = this.a;
        dcu dcuVarA = dcu.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
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
            iA12 = cgh.A(cursorF, "backoff_delay_duration");
            iA13 = cgh.A(cursorF, "last_enqueue_time");
            iA14 = cgh.A(cursorF, "minimum_retention_duration");
            dcuVar = dcuVarA;
        } catch (Throwable th) {
            th = th;
            dcuVar = dcuVarA;
        }
        try {
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
            int iA28 = cgh.A(cursorF, YyLACfm.KwRNHOofcJNIreg);
            int iA29 = cgh.A(cursorF, "requires_battery_not_low");
            int iA30 = cgh.A(cursorF, "requires_storage_not_low");
            int iA31 = cgh.A(cursorF, "trigger_content_update_delay");
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
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorF.close();
            dcuVar.j();
            throw th;
        }
    }

    @Override // defpackage.eby
    public final List d(String str) {
        dcu dcuVarA = dcu.a(INRGuObcrHjSQz.YrZErQmgoWXGuWn, 1);
        dcuVarA.g(1, str);
        dco dcoVar = this.a;
        dcoVar.k();
        Cursor cursorF = cwy.f(dcoVar, dcuVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(new ebw(cursorF.getString(0), AmbientLifecycleObserver.AmbientLifecycleCallback.CC.y(cursorF.getInt(1))));
            }
            return arrayList;
        } finally {
            cursorF.close();
            dcuVarA.j();
        }
    }

    @Override // defpackage.eby
    public final List j() throws Throwable {
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
        int iA12;
        int iA13;
        int iA14;
        dcu dcuVarA = dcu.a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        dcuVarA.e(1, 200L);
        dco dcoVar = this.a;
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
            iA11 = cgh.A(cursorF, clFzVRcygwbq.kBISICgOH);
            iA12 = cgh.A(cursorF, "backoff_delay_duration");
            iA13 = cgh.A(cursorF, "last_enqueue_time");
            iA14 = cgh.A(cursorF, "minimum_retention_duration");
            dcuVar = dcuVarA;
        } catch (Throwable th) {
            th = th;
            dcuVar = dcuVarA;
        }
        try {
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
            int iA31 = cgh.A(cursorF, "trigger_content_update_delay");
            int iA32 = cgh.A(cursorF, ibINv.yslxxgonKpcLR);
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
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorF.close();
            dcuVar.j();
            throw th;
        }
    }
}
