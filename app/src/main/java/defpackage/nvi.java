package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2017.ExperimentalKeys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvi {
    private static final boolean A;
    public static final CameraCharacteristics.Key a;
    public static final CaptureRequest.Key b;
    public static final CaptureResult.Key c;
    public static final CaptureResult.Key d;

    @Deprecated
    public static final CaptureResult.Key e;

    @Deprecated
    public static final CaptureResult.Key f;
    public static final CaptureResult.Key g;
    public static final CaptureResult.Key h;
    public static final CaptureRequest.Key i;
    public static final CaptureRequest.Key j;
    public static final CameraCharacteristics.Key k;
    public static final CameraCharacteristics.Key l;
    public static final CameraCharacteristics.Key m;
    public static final CameraCharacteristics.Key n;
    public static final CaptureRequest.Key o;
    public static final Integer p;
    public static final CaptureResult.Key q;
    private static final boolean r;
    private static final boolean s;
    private static final boolean t;
    private static final boolean u;
    private static final boolean v;
    private static final boolean w;
    private static final boolean x;
    private static final boolean y;
    private static final boolean z;

    static {
        boolean zB = nvr.b(2);
        r = zB;
        boolean zB2 = nvr.b(3);
        s = zB2;
        boolean zB3 = nvr.b(4);
        t = zB3;
        boolean zB4 = nvr.b(5);
        u = zB4;
        boolean zB5 = nvr.b(6);
        v = zB5;
        boolean zB6 = nvr.b(7);
        w = zB6;
        boolean zB7 = nvr.b(8);
        x = zB7;
        boolean zB8 = nvr.b(10);
        y = zB8;
        boolean zB9 = nvr.b(11);
        z = zB9;
        boolean zB10 = nvr.b(13);
        A = zB10;
        if (zB) {
            CaptureRequest.Key key = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRAM_MODE;
        }
        if (zB) {
            CameraCharacteristics.Key key2 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRM_AVAILABLE_HISTOGRAM_BUCKET_COUNTS;
        }
        if (zB) {
            CaptureRequest.Key key3 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRM_BUCKET_COUNT;
        }
        if (zB) {
            CaptureResult.Key key4 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRAM;
        }
        CaptureResult.Key key5 = null;
        a = zB ? ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_INFORMATION : null;
        if (zB && g()) {
            CameraCharacteristics.Key key6 = ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_DIMENSIONS;
        }
        b = (zB && g()) ? ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_ENABLE : null;
        if (zB) {
            CaptureRequest.Key key7 = ExperimentalKeys.EXPERIMENTAL_CONTROL_TRACKING_AF_TRIGGER;
        }
        if (zB) {
            CaptureResult.Key key8 = ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_REGIONS_CONFIDENCE;
        }
        if (zB) {
            CaptureResult.Key key9 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_VSYNC;
        }
        c = zB ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME : null;
        d = zB ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_TIMESTAMPS_BOOTTIME : null;
        e = zB ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_X : null;
        f = zB ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_Y : null;
        g = (zB && e()) ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_X : null;
        h = (zB && e()) ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_Y : null;
        if (zB && a()) {
            CaptureResult.Key key10 = ExperimentalKeys.EXPERIMENTAL_CONTROL_EXP_TIME_BOOST;
        }
        if (c()) {
            CaptureResult.Key key11 = ExperimentalKeys.EXPERIMENTAL_REQUEST_NEXT_STILL_INTENT_REQUEST_READY;
        }
        if (c()) {
            CaptureRequest.Key key12 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW;
        }
        if (c()) {
            CaptureResult.Key key13 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_CONFIG;
        }
        if (c()) {
            CaptureResult.Key key14 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_DATA;
        }
        i = c() ? ExperimentalKeys.EXPERIMENTAL_CONTINUOUS_ZSL_CAPTURE : null;
        j = (zB && b()) ? ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS : (zB2 && b()) ? com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS : zB3 ? com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS : zB4 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS : zB5 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS : zB6 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS : zB7 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS : zB8 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS : zB9 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS : zB10 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS : null;
        if (h()) {
            CaptureResult.Key key15 = ExperimentalKeys.EXPERIMENTAL_CONTROL_SCENE_DISTANCE;
        }
        if (zB && f()) {
            CameraCharacteristics.Key key16 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_RIGHT_GAIN_MAP;
        }
        if (zB && f()) {
            CameraCharacteristics.Key key17 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_LEFT_GAIN_MAP;
        }
        if (zB && f()) {
            CameraCharacteristics.Key key18 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_DCC;
        }
        k = (zB && i()) ? ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_NUM_LIGHTS : (zB2 && i()) ? com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_NUM_LIGHTS : zB3 ? com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS : zB4 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS : zB5 ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS : zB6 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS : zB7 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS : zB8 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS : zB9 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS : zB10 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS : null;
        l = (zB && i()) ? ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_R_OVER_G_RATIOS : (zB2 && i()) ? com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_R_OVER_G_RATIOS : zB3 ? com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS : zB4 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS : zB5 ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS : zB6 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS : zB7 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS : zB8 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS : zB9 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS : zB10 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS : null;
        m = (zB && i()) ? ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_B_OVER_G_RATIOS : (zB2 && i()) ? com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_B_OVER_G_RATIOS : zB3 ? com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS : zB4 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS : zB5 ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS : zB6 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS : zB7 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS : zB8 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS : zB9 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS : zB10 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS : null;
        n = (zB && i()) ? ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : (zB2 && i()) ? com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : zB3 ? com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : zB4 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : zB5 ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : zB6 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : zB7 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : zB8 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : zB9 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : zB10 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : null;
        o = (zB && d()) ? ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE : (zB2 && d()) ? com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE : zB3 ? com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE : zB4 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE : zB5 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE : zB6 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE : zB7 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE : zB8 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE : zB9 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE : zB10 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE : null;
        p = 1;
        if (zB && d()) {
            CaptureResult.Key key19 = ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_X;
        } else if (zB2 && d()) {
            CaptureResult.Key key20 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_X;
        } else if (zB3) {
            CaptureResult.Key key21 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zB4) {
            CaptureResult.Key key22 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zB5) {
            CaptureResult.Key key23 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zB6) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zB7) {
            CaptureResult.Key key25 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zB8) {
            CaptureResult.Key key26 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zB9) {
            CaptureResult.Key key27 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zB10) {
            CaptureResult.Key key28 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        }
        if (zB && d()) {
            CaptureResult.Key key29 = ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_Y;
        } else if (zB2 && d()) {
            CaptureResult.Key key30 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_Y;
        } else if (zB3) {
            CaptureResult.Key key31 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zB4) {
            CaptureResult.Key key32 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zB5) {
            CaptureResult.Key key33 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zB6) {
            CaptureResult.Key key34 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zB7) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zB8) {
            CaptureResult.Key key36 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zB9) {
            CaptureResult.Key key37 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zB10) {
            CaptureResult.Key key38 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        }
        if (zB && d()) {
            key5 = ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        } else if (zB2 && d()) {
            key5 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        } else if (zB3) {
            key5 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zB4) {
            key5 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zB5) {
            key5 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zB6) {
            key5 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zB7) {
            key5 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zB8) {
            key5 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zB9) {
            key5 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zB10) {
            key5 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        }
        q = key5;
    }

    private static boolean a() {
        if (r) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 2) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }

    private static boolean b() {
        return r ? ExperimentalKeys.getLibraryVersion() >= 5 : s && com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() >= 3;
    }

    private static boolean c() {
        if (r) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 4) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }

    private static boolean d() {
        return r ? ExperimentalKeys.getLibraryVersion() >= 9 : s && com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() >= 4;
    }

    private static boolean e() {
        if (r) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 3) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }

    private static boolean f() {
        if (r) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 7) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }

    private static boolean g() {
        if (r) {
            try {
                if (ExperimentalKeys.getLibraryVersion() > 0) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }

    private static boolean h() {
        if (r) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 6) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }

    private static boolean i() {
        return r ? ExperimentalKeys.getLibraryVersion() >= 10 : s && com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() > 0;
    }
}
