package defpackage;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.storage.StorageManager;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface imx {
    public static final qzx b = new qzx(AudioManager.class, "audio", 2);
    public static final qzx c = new qzx(AccessibilityManager.class, "accessibility", 3);
    public static final qzx d = new qzx(CameraManager.class, "camera", 4);
    public static final qzx e = new qzx(DevicePolicyManager.class, "device_policy", 5);
    public static final qzx f = new qzx(DisplayManager.class, "display", 6);
    public static final qzx g = new qzx(KeyguardManager.class, "keyguard", 7);
    public static final qzx h = new qzx(LocationManager.class, "location", 8);
    public static final qzx i = new qzx(NotificationManager.class, "notification", 9);
    public static final qzx j = new qzx(PowerManager.class, "power", 10);
    public static final qzx k = new qzx(SensorManager.class, "sensor", 11);
    public static final qzx l = new qzx(StorageManager.class, "storage", 14);
    public static final qzx m = new qzx(JobScheduler.class, "jobscheduler", 15);
    public static final qzx n = new qzx(UserManager.class, "user", 16);

    Object a(qzx qzxVar);
}
