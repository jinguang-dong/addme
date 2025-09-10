package defpackage;

import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pdb {
    private static final double b = Math.log(2.0d);
    private static final Long c = 1000L;
    public final ExifInterface a;

    public pdb(ExifInterface exifInterface) {
        this.a = exifInterface;
    }

    public static ExifInterface a(byte[] bArr) {
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.q(bArr);
            return exifInterface;
        } catch (IOException e) {
            Log.w("CAM_CameraExif", "Failed to read EXIF data", e);
            return exifInterface;
        }
    }

    public static pdb b() {
        return new pdb(new ExifInterface());
    }

    public static final pap i(Float f, Long l) {
        if (f == null || l == null) {
            return null;
        }
        return new pap((long) (f.floatValue() * l.longValue()), l.longValue());
    }

    private static final pap j(Double d, Long l) {
        double dDoubleValue = d.doubleValue();
        l.longValue();
        l.longValue();
        return new pap((long) (dDoubleValue * 100.0d), 100L);
    }

    public final void c(int i, Object obj) {
        if (obj != null) {
            ExifInterface exifInterface = this.a;
            exifInterface.y(exifInterface.i(i, obj));
        }
    }

    public final void d(Location location) {
        ExifInterface exifInterface = this.a;
        int i = ExifInterface.aR;
        if (exifInterface.k(i) == null) {
            exifInterface.y(exifInterface.i(i, new byte[]{2, 2, 0, 0}));
        }
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        pcz pczVarI = exifInterface.i(ExifInterface.aT, ExifInterface.w(latitude));
        pcz pczVarI2 = exifInterface.i(ExifInterface.aV, ExifInterface.w(longitude));
        pcz pczVarI3 = exifInterface.i(ExifInterface.aS, latitude >= 0.0d ? "N" : "S");
        pcz pczVarI4 = exifInterface.i(ExifInterface.aU, longitude >= 0.0d ? "E" : "W");
        if (pczVarI != null && pczVarI2 != null && pczVarI3 != null && pczVarI4 != null) {
            exifInterface.y(pczVarI);
            exifInterface.y(pczVarI2);
            exifInterface.y(pczVarI3);
            exifInterface.y(pczVarI4);
        }
        long time = location.getTime();
        pcz pczVarI5 = exifInterface.i(ExifInterface.bs, exifInterface.bC.format(Long.valueOf(time)));
        if (pczVarI5 != null) {
            exifInterface.y(pczVarI5);
            exifInterface.bD.setTimeInMillis(time);
            pcz pczVarI6 = exifInterface.i(ExifInterface.aY, new pap[]{new pap(r2.get(11), 1L), new pap(r2.get(12), 1L), new pap(r2.get(13), 1L)});
            if (pczVarI6 != null) {
                exifInterface.y(pczVarI6);
            }
        }
        if (location.hasAltitude()) {
            double altitude = location.getAltitude();
            int i2 = ExifInterface.aX;
            double dAbs = Math.abs(altitude);
            Long l = ExifInterface.bx;
            l.longValue();
            l.longValue();
            pcz pczVarI7 = exifInterface.i(i2, new pap((int) (dAbs * 100.0d), 100L));
            pcz pczVarI8 = exifInterface.i(ExifInterface.aW, Byte.valueOf(altitude >= 0.0d ? (byte) 0 : (byte) 1));
            if (pczVarI7 == null || pczVarI8 == null) {
                return;
            }
            exifInterface.y(pczVarI7);
            exifInterface.y(pczVarI8);
        }
    }

    public final void e() {
        c(ExifInterface.g, Build.MANUFACTURER);
        c(ExifInterface.h, Build.MODEL);
    }

    public final void f(int i, int i2, pao paoVar, rwc rwcVar) {
        Object papVar;
        Object papVar2;
        e();
        ExifInterface exifInterface = this.a;
        int i3 = ExifInterface.ai;
        Integer numValueOf = Integer.valueOf(i);
        exifInterface.y(exifInterface.i(i3, numValueOf));
        int i4 = ExifInterface.aj;
        Integer numValueOf2 = Integer.valueOf(i2);
        exifInterface.y(exifInterface.i(i4, numValueOf2));
        exifInterface.y(exifInterface.i(ExifInterface.a, numValueOf));
        exifInterface.y(exifInterface.i(ExifInterface.b, numValueOf2));
        exifInterface.y(exifInterface.i(ExifInterface.j, Short.valueOf(pcu.b(paoVar).i)));
        if (rwcVar.h()) {
            pnx pnxVar = (pnx) rwcVar.c();
            Long l = 1000000000L;
            Long l2 = (Long) pnxVar.a(CaptureResult.SENSOR_EXPOSURE_TIME);
            int i5 = ExifInterface.F;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                l.getClass();
                papVar = new pap(jLongValue, 1000000000L);
            } else {
                papVar = null;
            }
            c(i5, papVar);
            if (l2 != null) {
                double dLongValue = l2.longValue();
                l.getClass();
                double d = dLongValue / 1.0E9d;
                Double.valueOf(d).getClass();
                c(ExifInterface.Q, j(Double.valueOf(Math.log(d) / b), 100L));
            }
            Integer numValueOf3 = (Integer) pnxVar.a(CaptureResult.SENSOR_SENSITIVITY);
            if (numValueOf3 != null) {
                if (((Integer) pnxVar.a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                    numValueOf3 = Integer.valueOf(Math.round(numValueOf3.intValue() * (r10.intValue() / 100.0f)));
                }
                c(ExifInterface.J, numValueOf3);
            }
            Float f = (Float) pnxVar.a(CaptureResult.LENS_APERTURE);
            c(ExifInterface.G, i(f, 100L));
            if (f != null) {
                double dLog = Math.log(f.floatValue()) / b;
                Double.valueOf(dLog).getClass();
                c(ExifInterface.R, j(Double.valueOf(dLog + dLog), 100L));
            }
            c(ExifInterface.Z, i((Float) pnxVar.a(CaptureResult.LENS_FOCAL_LENGTH), 1000L));
            Integer num = (Integer) pnxVar.a(CaptureResult.FLASH_STATE);
            short s = 1;
            if (num == null || num.intValue() != 3) {
                c(ExifInterface.Y, (short) 0);
            } else {
                c(ExifInterface.Y, (short) 1);
            }
            Float f2 = (Float) pnxVar.a(CaptureResult.LENS_FOCUS_DISTANCE);
            if (f2 != null) {
                if (f2.floatValue() > 1.0E-6f) {
                    float fFloatValue = 1.0f / f2.floatValue();
                    papVar2 = i(Float.valueOf(fFloatValue), c);
                    if (fFloatValue >= 1.0f) {
                        s = fFloatValue < 3.0f ? (short) 2 : (short) 3;
                    }
                } else if (f2.floatValue() >= 0.0f) {
                    papVar2 = new pap(-1L, 1L);
                } else {
                    s = 0;
                    papVar2 = new pap(0L, 1L);
                }
                c(ExifInterface.V, papVar2);
                c(ExifInterface.aI, Short.valueOf(s));
            }
        }
    }

    public final void g(long j) {
        if (j > 0) {
            ExifInterface exifInterface = this.a;
            exifInterface.x(ExifInterface.s, j, TimeZone.getDefault());
            exifInterface.x(ExifInterface.M, j, TimeZone.getDefault());
            exifInterface.x(ExifInterface.N, j, TimeZone.getDefault());
        }
    }

    public final void h(pka pkaVar, pap papVar, pap papVar2) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        c(ExifInterface.aK, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int iOrdinal = pkaVar.ordinal();
        arrayList.add((iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? "unknown" : "external" : "back" : "front").concat(" camera"));
        if (papVar != null) {
            arrayList.add(papVar.a() + "mm");
        }
        if (papVar2 != null) {
            arrayList.add("f/" + papVar2.a());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) arrayList.get(i));
            if (i < arrayList.size() - 1) {
                sb.append(' ');
            }
        }
        ExifInterface exifInterface = this.a;
        exifInterface.y(exifInterface.i(ExifInterface.aL, sb.toString()));
    }
}
