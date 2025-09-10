package defpackage;

import android.hardware.HardwareBuffer;
import android.hardware.Sensor;
import android.hardware.SensorDirectChannel;
import android.hardware.SensorManager;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pkx implements plc {
    public final pbc a;
    private final SensorManager c;
    private final Set d = new HashSet();
    public pmv b = null;

    public pkx(SensorManager sensorManager, pbc pbcVar) {
        this.c = sensorManager;
        this.a = pbcVar;
    }

    public static boolean d(SensorManager sensorManager, int i) {
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        return defaultSensor != null && defaultSensor.isDirectChannelTypeSupported(2) && defaultSensor.getHighestDirectReportRateLevel() >= 2 && ReadHardwareBufferJniFunctions.isSupported();
    }

    private final synchronized void e() {
        pbc pbcVar = this.a;
        pbcVar.b("Shutting down imu direct channel");
        pmv pmvVar = this.b;
        if (pmvVar == null) {
            pbcVar.h("Failed to stop direct imu provider: Already stopped");
            return;
        }
        Object obj = pmvVar.d;
        if (((SensorDirectChannel) obj).configure((Sensor) pmvVar.b, 0) == 0) {
            pbcVar.d("Failed to stop direct imu provider: Unable to configure imu direct channel.");
        } else {
            pbcVar.b("Stopped imu direct channel successfully.");
        }
        ((SensorDirectChannel) obj).close();
        ((qpf) pmvVar.c).e();
        this.b = null;
    }

    private final synchronized void f() {
        pbc pbcVar = this.a;
        pbcVar.b("Starting up imu direct channel");
        if (this.b != null) {
            pbcVar.h("Failed to start direct imu provider: Already running.");
            return;
        }
        try {
            HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(624000, 1, 33, 1, 25165827L);
            if (hardwareBufferCreate == null) {
                this.a.d("Failed to start direct imu provider: Hardware Buffer returned null.");
                return;
            }
            qpf qpfVar = new qpf(hardwareBufferCreate);
            SensorDirectChannel sensorDirectChannelCreateDirectChannel = null;
            try {
                pkz pkzVar = new pkz(qpfVar);
                try {
                    SensorManager sensorManager = this.c;
                    sensorDirectChannelCreateDirectChannel = sensorManager.createDirectChannel(hardwareBufferCreate);
                    if (sensorDirectChannelCreateDirectChannel == null) {
                        this.a.d("Failed to start direct imu provider: Creating direct channel returned null");
                        this.a.b(UvOvSgfD.vWStpcalqkvjB);
                        qpfVar.e();
                        return;
                    }
                    Sensor defaultSensor = sensorManager.getDefaultSensor(a());
                    if (defaultSensor == null) {
                        pbc pbcVar2 = this.a;
                        pbcVar2.d("Failed to start direct imu provider: Getting default sensor returned null.");
                        pbcVar2.b("Closing hardware buffer");
                        qpfVar.e();
                        sensorDirectChannelCreateDirectChannel.close();
                        return;
                    }
                    if (sensorDirectChannelCreateDirectChannel.configure(defaultSensor, 2) != 0) {
                        this.a.b("Started imu direct channel successfully");
                        this.b = new pmv(qpfVar, sensorDirectChannelCreateDirectChannel, defaultSensor, pkzVar);
                        return;
                    }
                    pbc pbcVar3 = this.a;
                    pbcVar3.d("Failed to start direct imu provider: Unable to configure imu direct channel.");
                    pbcVar3.b("Closing hardware buffer");
                    qpfVar.e();
                    sensorDirectChannelCreateDirectChannel.close();
                } catch (Throwable th) {
                    this.a.e("Failed to start direct imu provider: Creating direct channel threw an exception.", th);
                }
            } finally {
                this.a.b("Closing hardware buffer");
                qpfVar.e();
                if (0 != 0) {
                    sensorDirectChannelCreateDirectChannel.close();
                }
            }
        } catch (IllegalArgumentException e) {
            this.a.e("Failed to start direct imu provider: Creating the hardware buffer threw an IllegalArgumentException exception.", e);
        }
    }

    @Override // defpackage.plc
    public final synchronized plb b(String str) {
        Set<plb> set = this.d;
        if (set.isEmpty()) {
            f();
        } else {
            for (plb plbVar : set) {
                if (str.equals(plbVar.a())) {
                    this.a.b("Fast imu provider session existed for: " + plbVar.a() + ". No new session added.");
                    return plbVar;
                }
            }
        }
        if (this.b == null) {
            this.a.d("Failed to open new direct imu session: Hardware was null.");
            return null;
        }
        pkw pkwVar = new pkw(this, str);
        set.add(pkwVar);
        this.a.b("Fast imu provider session added for: ".concat(pkwVar.a));
        return pkwVar;
    }

    public final synchronized void c(plb plbVar) {
        Set set = this.d;
        if (set.remove(plbVar)) {
            this.a.b("Fast imu provider session closed for: " + ((pkw) plbVar).a + " Remaining number of sessions = " + set.size());
        }
        if (set.isEmpty()) {
            e();
        }
    }

    protected final synchronized void finalize() {
        pmv pmvVar = this.b;
        if (pmvVar != null) {
            Object obj = pmvVar.d;
            if (((SensorDirectChannel) obj).configure((Sensor) pmvVar.b, 0) == 0) {
                this.a.d("Failed to stop direct imu provider in finalizer: Unable to configure imu direct channel.");
            }
            ((SensorDirectChannel) obj).close();
            ((qpf) pmvVar.c).e();
            this.a.h("Imu direct channel reference potentially leaked and was closed in finalizer.");
            this.b = null;
        }
    }
}
