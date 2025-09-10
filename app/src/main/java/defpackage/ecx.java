package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecx implements Runnable {
    private final Context c;
    private final dyj d;
    private int e = 0;
    private final ejs f;
    private static final String b = dwj.a("ForceStopRunnable");
    public static final long a = TimeUnit.DAYS.toMillis(3650);

    public ecx(Context context, dyj dyjVar) {
        this.c = context.getApplicationContext();
        this.d = dyjVar;
        this.f = dyjVar.i;
    }

    public static PendingIntent a(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        File file;
        boolean z;
        List<ApplicationExitInfo> historicalProcessExitReasons;
        try {
            dyj dyjVar = this.d;
            dvs dvsVar = dyjVar.c;
            File file2 = null;
            if (!TextUtils.isEmpty(null)) {
                boolean zA = eda.a(this.c, dvsVar);
                dwj.b();
                if (zA) {
                }
            }
            dwj.b();
            while (true) {
                try {
                    Context context = this.c;
                    context.getClass();
                    if (cpo.m(context).exists()) {
                        dwj.b();
                        String str = dxy.a;
                        File fileM = cpo.m(context);
                        File noBackupFilesDir = context.getNoBackupFilesDir();
                        noBackupFilesDir.getClass();
                        File file3 = new File(noBackupFilesDir, "androidx.work.workdb");
                        String[] strArr = dxy.b;
                        int length = strArr.length;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(ukc.n(ske.aZ(3), 16));
                        int i = 0;
                        for (int i2 = 3; i < i2; i2 = 3) {
                            String str2 = strArr[i];
                            file = new File(String.valueOf(fileM.getPath()).concat(String.valueOf(str2)));
                            uev uevVar = new uev(file, new File(String.valueOf(file3.getPath()).concat(String.valueOf(str2))));
                            linkedHashMap.put(uevVar.a, uevVar.b);
                            i++;
                        }
                        for (Map.Entry entry : ske.be(linkedHashMap, new uev(fileM, file3)).entrySet()) {
                            File file4 = (File) entry.getKey();
                            File file5 = (File) entry.getValue();
                            if (file4.exists()) {
                                if (file5.exists()) {
                                    dwj.b();
                                    String str3 = dxy.a;
                                    Objects.toString(file5);
                                    Log.w(str3, "Over-writing contents of ".concat(String.valueOf(file5)));
                                }
                                if (file4.renameTo(file5)) {
                                    Objects.toString(file4);
                                    Objects.toString(file5);
                                } else {
                                    Objects.toString(file4);
                                    Objects.toString(file5);
                                }
                                dwj.b();
                            }
                        }
                    }
                    dwj.b();
                    int i3 = 1;
                    try {
                        try {
                            WorkDatabase workDatabase = dyjVar.d;
                            int i4 = dzm.a;
                            JobScheduler jobSchedulerA = dzk.a(context);
                            List<JobInfo> listE = dzm.e(context, jobSchedulerA);
                            dco dcoVar = ((ebl) workDatabase.y()).a;
                            dcu dcuVarA = dcu.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
                            dcoVar.k();
                            Cursor cursorF = cwy.f(dcoVar, dcuVarA);
                            try {
                                ArrayList arrayList = new ArrayList(cursorF.getCount());
                                while (cursorF.moveToNext()) {
                                    arrayList.add(cursorF.getString(0));
                                }
                                cursorF.close();
                                dcuVarA.j();
                                HashSet hashSet = new HashSet(listE != null ? listE.size() : 0);
                                if (listE != null && !listE.isEmpty()) {
                                    for (JobInfo jobInfo : listE) {
                                        ebm ebmVarA = dzm.a(jobInfo);
                                        if (ebmVarA != null) {
                                            hashSet.add(ebmVarA.a);
                                        } else {
                                            dzm.f(jobSchedulerA, jobInfo.getId());
                                        }
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!hashSet.contains((String) it.next())) {
                                            dwj.b();
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                if (z) {
                                    workDatabase.l();
                                    try {
                                        eby ebyVarB = workDatabase.B();
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            ebyVarB.k((String) it2.next(), -1L);
                                        }
                                        workDatabase.p();
                                        workDatabase.n();
                                    } catch (Throwable th) {
                                        workDatabase.n();
                                        throw th;
                                    }
                                }
                                WorkDatabase workDatabase2 = dyjVar.d;
                                eby ebyVarB2 = workDatabase2.B();
                                ebr ebrVarA = workDatabase2.A();
                                workDatabase2.l();
                                try {
                                    List listB = ebyVarB2.b();
                                    boolean zIsEmpty = listB.isEmpty();
                                    if (!zIsEmpty) {
                                        try {
                                            Iterator it3 = listB.iterator();
                                            while (it3.hasNext()) {
                                                String str4 = ((ebx) it3.next()).b;
                                                ebyVarB2.m(i3, str4);
                                                int i5 = i3;
                                                try {
                                                    ebyVarB2.i(str4, -512);
                                                    ebyVarB2.k(str4, -1L);
                                                    i3 = i5;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    workDatabase2.n();
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                    int i6 = i3;
                                    dco dcoVar2 = ((ebv) ebrVarA).a;
                                    dcoVar2.k();
                                    dfq dfqVarD = ((ebv) ebrVarA).b.d();
                                    try {
                                        dcoVar2.l();
                                        try {
                                            dfqVarD.a();
                                            dcoVar2.p();
                                            ((ebv) ebrVarA).a.n();
                                            ((ebv) ebrVarA).b.f(dfqVarD);
                                            workDatabase2.p();
                                            try {
                                                workDatabase2.n();
                                                int i7 = (!zIsEmpty || z) ? i6 : 0;
                                                Long lA = ((WorkDatabase) dyjVar.i.a).x().a("reschedule_needed");
                                                if (lA == null || lA.longValue() != 1) {
                                                    try {
                                                        PendingIntent pendingIntentA = a(context, 570425344);
                                                        if (pendingIntentA != null) {
                                                            pendingIntentA.cancel();
                                                        }
                                                        try {
                                                            historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                                                        } catch (IllegalArgumentException | SecurityException e) {
                                                            e = e;
                                                            dwj.b();
                                                            Log.w(b, "Ignoring exception", e);
                                                            dwj.b();
                                                            dyj dyjVar2 = this.d;
                                                            dyjVar2.c();
                                                            ejs ejsVar = this.f;
                                                            cpn cpnVar = dyjVar2.c.g;
                                                            ((WorkDatabase) ejsVar.a).x().b(new ebb("last_force_stop_ms", Long.valueOf(System.currentTimeMillis())));
                                                        }
                                                    } catch (IllegalArgumentException | SecurityException e2) {
                                                        e = e2;
                                                    }
                                                    if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                                        Long lA2 = ((WorkDatabase) this.f.a).x().a("last_force_stop_ms");
                                                        long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                                                        for (int i8 = 0; i8 < historicalProcessExitReasons.size(); i8++) {
                                                            ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i8);
                                                            if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jLongValue) {
                                                                dwj.b();
                                                                dyj dyjVar22 = this.d;
                                                                dyjVar22.c();
                                                                ejs ejsVar2 = this.f;
                                                                cpn cpnVar2 = dyjVar22.c.g;
                                                                ((WorkDatabase) ejsVar2.a).x().b(new ebb("last_force_stop_ms", Long.valueOf(System.currentTimeMillis())));
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    if (i7 != 0) {
                                                        dwj.b();
                                                        dxn.a(dyjVar.c, dyjVar.d, dyjVar.e);
                                                    }
                                                } else {
                                                    dwj.b();
                                                    dyjVar.c();
                                                    ((WorkDatabase) dyjVar.i.a).x().b(new ebb("reschedule_needed", 0L));
                                                }
                                            } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e3) {
                                                e = e3;
                                                file = null;
                                                int i9 = this.e + 1;
                                                this.e = i9;
                                                if (i9 >= 3) {
                                                    String str5 = ((UserManager) this.c.getSystemService(UserManager.class)).isUserUnlocked() ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                                    dwj.b();
                                                    Log.e(b, str5, e);
                                                    throw new IllegalStateException(str5, e);
                                                }
                                                dwj.b();
                                                try {
                                                    Thread.sleep(this.e * 300);
                                                } catch (InterruptedException unused) {
                                                }
                                                file2 = file;
                                            }
                                        } catch (Throwable th4) {
                                            try {
                                                ((ebv) ebrVarA).a.n();
                                                throw th4;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                try {
                                                    ((ebv) ebrVarA).b.f(dfqVarD);
                                                    throw th;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    workDatabase2.n();
                                                    throw th;
                                                }
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                cursorF.close();
                                dcuVarA.j();
                                throw th9;
                            }
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e4) {
                            e = e4;
                            file = file2;
                        }
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e5) {
                        e = e5;
                    }
                    file2 = file;
                } catch (SQLiteException e6) {
                    dwj.b();
                    Log.e(b, "Unexpected SQLite exception during migrations");
                    throw new IllegalStateException("Unexpected SQLite exception during migrations", e6);
                }
            }
        } finally {
            this.d.b();
        }
    }
}
