package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ooe {
    public final Object b;
    public final PowerManager.WakeLock c;
    public int d;
    public Future e;
    public long f;
    public boolean g;
    public int h;
    public olp i;
    public final String j;
    public final String k;
    public final Map l;
    public AtomicInteger m;
    public final ScheduledExecutorService n;
    public ojh o;
    private final Set s;
    private WorkSource t;
    public static final long a = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService q = null;
    private static final Object r = new Object();
    public static volatile nwj p = new nwj();

    private static void e(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public final void a() {
        Set set = this.s;
        if (set.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        set.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.d > 0;
        }
        return z;
    }

    public final void c() {
        if (this.g) {
            TextUtils.isEmpty(null);
        }
    }

    public final void d() {
        synchronized (this.b) {
            if (b()) {
                if (this.g) {
                    int i = this.d - 1;
                    this.d = i;
                    if (i > 0) {
                        return;
                    }
                } else {
                    this.d = 0;
                }
                a();
                Map map = this.l;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((ood) it.next()).a = 0;
                }
                map.clear();
                Future future = this.e;
                if (future != null) {
                    future.cancel(false);
                    this.e = null;
                    this.f = 0L;
                }
                this.h = 0;
                PowerManager.WakeLock wakeLock = this.c;
                if (wakeLock.isHeld()) {
                    try {
                        try {
                            wakeLock.release();
                        } finally {
                            if (this.i != null) {
                                this.i = null;
                            }
                        }
                    } catch (RuntimeException e) {
                        if (!e.getClass().equals(RuntimeException.class)) {
                            throw e;
                        }
                        Log.e("WakeLock", String.format("%s failed to release!", this.j), e);
                        if (this.i != null) {
                            this.i = null;
                        }
                    }
                } else {
                    nwj.s("%s should be held!", this.j);
                }
            }
        }
    }

    public ooe(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String packageName = context.getPackageName();
        this.b = new Object();
        this.d = 0;
        this.s = new HashSet();
        this.g = true;
        this.o = ojh.a;
        this.l = new HashMap();
        this.m = new AtomicInteger(0);
        ojl.az(context, "WakeLock: context must not be null");
        ojl.ax("Analytics WakeLock", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.k = "Analytics WakeLock";
        WorkSource workSource = null;
        this.i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.j = "*gcore*:Analytics WakeLock";
        } else {
            this.j = "Analytics WakeLock";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        rnt.x(powerManager);
        this.c = powerManager.newWakeLock(1, "Analytics WakeLock");
        if (ojn.b(context)) {
            int i = ojm.a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoH = ojo.b(context).h(packageName, 0);
                    if (applicationInfoH == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoH.uid;
                        workSource = new WorkSource();
                        ojn.a(workSource, i2, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", LmJPKwPBa.zloWVpyFORQOf.concat(packageName));
                }
            }
            this.t = workSource;
            if (workSource != null) {
                e(this.c, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = q;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (r) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = q;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    ojl ojlVar = olr.a;
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
